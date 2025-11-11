package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.EstadoEnvio;
import co.edu.uniquindio.poo.model.HistorialEntrega;
import co.edu.uniquindio.poo.service.IHistorialEntregaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Patrón Observer
import java.util.Observer;
import java.util.Observable;

public class HistorialEntregaServiceImpl implements IHistorialEntregaService, Observer {

    private final List<HistorialEntrega> historialGlobal;

    public HistorialEntregaServiceImpl() {
        this.historialGlobal = new ArrayList<>();
    }

    /**
     * Este es el método clave del patrón Observer.
     * Es llamado automáticamente por Envio (el Observable) cuando
     * el estado del envío cambia.
     */
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof EstadoEnvio) {
            EstadoEnvio nuevoEstado = (EstadoEnvio) arg;
            String id = "Obs-" + UUID.randomUUID().toString().substring(0, 4);
            String observacion = "El envío ha cambiado al estado: " + nuevoEstado.name();
            this.registrarEvento(id, observacion, nuevoEstado);
        }
    }

    @Override
    public HistorialEntrega registrarEvento(String id, String observacion) {
        return registrarEvento(id, observacion, EstadoEnvio.INCIDENCIA);
    }

    private HistorialEntrega registrarEvento(String id, String observacion, EstadoEnvio estado) {
        String idHistorial = (id != null) ? id : "H-" + UUID.randomUUID().toString().substring(0, 4);
        HistorialEntrega evento = new HistorialEntrega(idHistorial, LocalDate.now(), estado, observacion);
        
        historialGlobal.add(evento);
        System.out.println("[HISTORIAL_LOG]: " + evento.getObservacion());
        return evento;
    }
}