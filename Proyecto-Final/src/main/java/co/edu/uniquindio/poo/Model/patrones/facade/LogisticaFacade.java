package co.edu.uniquindio.poo.model.patrones.facade;

import co.edu.uniquindio.poo.controller.*;
import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.model.patrones.builder.EnvioBuilder;
import co.edu.uniquindio.poo.model.patrones.strategy.IPagoStrategy;
import java.util.List;

/**
 * Patrón Estructural Facade 
 * La vista (JavaFX) solo tendría que hablar con esta Facade.
 */
public class LogisticaFacade {
    private final UsuarioController usuarioController;
    private final EnvioController envioController;
    private final TarifaController tarifaController;
    private final PagoController pagoController;
    private final AdminController adminController;
    private final RepartidorController repartidorController;

    public LogisticaFacade(UsuarioController uc, EnvioController ec, TarifaController tc,
                           PagoController pc, AdminController ac, RepartidorController rc) {
        this.usuarioController = uc;
        this.envioController = ec;
        this.tarifaController = tc;
        this.pagoController = pc;
        this.adminController = ac;
        this.repartidorController = rc;
    }

    public Usuario registrarUsuario(String id, String nombre, String correo, String tel) {
        Usuario u = new Usuario(id, nombre, correo, tel);
        boolean exito = usuarioController.registrarUsuario(u);
        return (exito) ? u : null;
    }

    public Usuario login(String idUsuario) {
        return usuarioController.buscarUsuario(idUsuario);
    }
    
    public double cotizarEnvio(double dist, double peso, double vol, Prioridad p) {
        return tarifaController.calcularCosto(dist, peso, vol, p, List.of()); 
    }

    public Envio crearYPaqarEnvio(Usuario usuario, Direccion origen, Direccion destino,
                                  double peso, double vol, Prioridad p, Tarifa tarifaBase,
                                  IPagoStrategy estrategiaPago) {
        
        // 1. Crear el envío (usa el Builder)
        EnvioBuilder builder = new EnvioBuilder()
                .setUsuario(usuario)
                .setOrigen(origen)
                .setDestino(destino)
                .setTarifaBase(tarifaBase)
                .setDetalles(peso, vol, p);
        
        Envio envio = envioController.crearEnvio(builder);
        
        // 2. Procesar el pago (usa el Strategy)
        Pago pago = pagoController.procesarPago(envio, estrategiaPago);

        if (pago.isAprobado()) {
            return envio;
        } else {
            return null;
        }
    }
    
    public Repartidor registrarRepartidor(String nom, String doc, String tel, String zona) {
        return repartidorController.registrarRepartidor(nom, doc, tel, zona);
    }

    public void asignarEnvio(Admin admin, Envio envio, Repartidor repartidor) {
        adminController.asignarEnvioARepartidor(admin, envio, repartidor);
    }
}