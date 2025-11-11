package co.edu.uniquindio.poo.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.EstadoEnvio;
import co.edu.uniquindio.poo.model.patrones.builder.EnvioBuilder;
import co.edu.uniquindio.poo.service.IEnvioService;
import co.edu.uniquindio.poo.service.IHistorialEntregaService; 
import co.edu.uniquindio.poo.service.ITarifaService;

public class EnvioServiceImpl implements IEnvioService {

    private final Database db = Database.getInstance();
    private final ITarifaService tarifaService;
    private final IHistorialEntregaService historialService; 

    public EnvioServiceImpl(ITarifaService tarifaService, IHistorialEntregaService historialService) {
        this.tarifaService = tarifaService;
        this.historialService = historialService;
    }

    @Override
    public Envio crearEnvio(EnvioBuilder builder) {
        // 1. Construir el envío
        Envio envio = builder.build();
        
        // 2. Calcular el costo usando el TarifaService
        double costo = tarifaService.calcularCosto(
                10.0, 
                envio.getDetalleEnvio().getPeso(),
                envio.getDetalleEnvio().getVolumen(),
                envio.getDetalleEnvio().getPrioridad(),
                envio.getServiciosAdicionales()
        );
        envio.setCosto(costo);

        // 3. Añadir el Observer (HistorialService) al Sujeto (Envio)
        envio.addObserver(historialService);
        
        // 4. Guardar en la "BD" y notificar
        db.getEnvios().add(envio);
        envio.setEstado(EstadoEnvio.SOLICITADO); // Esto notificará al observer
        
        System.out.println("Envío creado: " + envio.getIdEnvio() + " con costo: " + costo);
        return envio;
    }

    @Override
    public boolean cancelarEnvio(String idEnvio) {
        Envio envio = db.findEnvioById(idEnvio);
        if (envio != null && envio.getEstado() == EstadoEnvio.SOLICITADO) {
            // Solo se puede cancelar si no ha sido asignado 
            envio.setEstado(EstadoEnvio.CANCELADO); 
            System.out.println("Envío " + idEnvio + " cancelado.");
            return true;
        }
        return false;
    }

    @Override
    public void actualizarEstadoEnvio(String idEnvio, EstadoEnvio nuevoEstado) {
        Envio envio = db.findEnvioById(idEnvio);
        if (envio != null) {
            envio.setEstado(nuevoEstado); 
            System.out.println("Envío " + idEnvio + " actualizado a " + nuevoEstado);
        }
    }

    @Override
    public Envio buscarEnvio(String idEnvio) {
        return db.findEnvioById(idEnvio);
    }

    @Override
    public List<Envio> listarEnviosPorUsuario(String idUsuario) {
        return db.getEnvios().stream()
                .filter(e -> e.getUsuario().getIdUsuario().equals(idUsuario))
                .collect(Collectors.toList());
    }

    @Override
    public List<Envio> listarEnviosPorEstado(EstadoEnvio estado) {
        return db.getEnvios().stream()
                .filter(e -> e.getEstado() == estado)
                .collect(Collectors.toList());
    }
}