package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.controller.*;
import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.model.patrones.builder.EnvioBuilder;
import co.edu.uniquindio.poo.model.patrones.facade.LogisticaFacade;
import co.edu.uniquindio.poo.model.patrones.factory.ReporteFactory;
import co.edu.uniquindio.poo.model.patrones.factory.IReporte;
import co.edu.uniquindio.poo.model.patrones.strategy.*;
import co.edu.uniquindio.poo.service.impl.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Inicializando Sistema (Servicios y Controladores) ---");

        // (Patrón Singleton) Los servicios acceden a la misma Database
        // (Patrón Observer) HistorialService se crea primero para que pueda observar
        HistorialEntregaServiceImpl historialService = new HistorialEntregaServiceImpl();
        
        // Inicializar Servicios (con sus dependencias)
        UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();
        TarifaServiceImpl tarifaService = new TarifaServiceImpl();
        EnvioServiceImpl envioService = new EnvioServiceImpl(tarifaService, historialService);
        PagoServiceImpl pagoService = new PagoServiceImpl();
        RepartidorServiceImpl repartidorService = new RepartidorServiceImpl();
        AdminServiceImpl adminService = new AdminServiceImpl();
        
        // Inicializar Controladores (con Inyección de Dependencias)
        UsuarioController uc = new UsuarioController(usuarioService);
        EnvioController ec = new EnvioController(envioService);
        TarifaController tc = new TarifaController(tarifaService);
        PagoController pc = new PagoController(pagoService);
        RepartidorController rc = new RepartidorController(repartidorService);
        AdminController ac = new AdminController(adminService);

        // (Patrón Facade) Crear la fachada para simplificar las llamadas
        LogisticaFacade facade = new LogisticaFacade(uc, ec, tc, pc, ac, rc);

        System.out.println("\n--- 2. Flujo de Usuario (RF-001 a RF-005) ---");

        // Usuario se registra 
        Usuario usuario1 = facade.registrarUsuario("111", "Ana Gomez", "ana@mail.com", "311");
        
        // Usuario agrega direcciones 
        Direccion dirCasa = new Direccion("D1", "Calle 1", "Armenia", "123,456", "Casa");
        Direccion dirOficina = new Direccion("D2", "Calle 2", "Pereira", "789,123", "Oficina");
        usuario1.agregarDireccion(dirCasa);
        
        // Usuario cotiza 
        double costoCotizado = facade.cotizarEnvio(15, 2, 0.1, Prioridad.NORMAL);
        System.out.println("Costo cotizado: " + costoCotizado);

        // (Patrón Builder) Usuario crea un envío 
        // (Patrón Strategy) Usuario selecciona método de pago 
        Tarifa tarifaBase = Database.getInstance().getTarifaBase(); // Obtener tarifa del Singleton
        
        System.out.println("\n--- Creando y Pagando Envío (Builder + Strategy) ---");
        IPagoStrategy pagoTarjeta = new PagoTarjetaStrategy("1234-5678", "Ana Gomez");
        
        Envio envio1 = facade.crearYPaqarEnvio(
            usuario1, dirCasa, dirOficina, 
            2, 0.1, Prioridad.NORMAL, tarifaBase, 
            pagoTarjeta
        );

        if (envio1 != null) {
            System.out.println("Envío creado y pagado: " + envio1.getIdEnvio());
            System.out.println("Estado actual: " + envio1.getEstado()); // Debería ser PAGADO
        }

        System.out.println("\n--- 3. Flujo de Administrador (RF-011, RF-012) ---");
        
        // Admin registra un repartidor 
        Repartidor repartidor1 = facade.registrarRepartidor("Carlos", "777", "322", "Zona_Norte");
        repartidorService.actualizarDisponibilidad(repartidor1.getIdRepartidor(), DisponibilidadRepartidor.ACTIVO);

        // Admin crea un Admin (para la asignación)
        Admin admin = new Admin("A1", null, null);

        // Admin asigna el envío 
        System.out.println("\n--- Asignando envío (Observer en acción) ---");
        facade.asignarEnvio(admin, envio1, repartidor1);
        System.out.println("Estado actual envío: " + envio1.getEstado()); // Debería ser ASIGNADO
        
        // Admin actualiza estados 
        envioService.actualizarEstadoEnvio(envio1.getIdEnvio(), EstadoEnvio.EN_RUTA);
        envioService.actualizarEstadoEnvio(envio1.getIdEnvio(), EstadoEnvio.ENTREGADO);
        
        System.out.println("\n--- 4. Flujo de Reportes (RF-039) ---");

        // (Patrón Factory Method) Admin genera un reporte 
        ReporteFactory reporteFactory = new ReporteFactory();
        IReporte reporteCSV = reporteFactory.crearReporte("CSV");
        
        String csvData = reporteCSV.generar(List.of(envio1));
        System.out.println(csvData);
    }
}