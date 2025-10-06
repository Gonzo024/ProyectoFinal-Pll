package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class HistorialEntrega {
    private String idHistorialEntrega;
    private LocalDate fechaEvento;
    private EstadoEnvio estado;
    private String observacion;

    public HistorialEntrega(String idHistorialEntrega, LocalDate fechaEvento, EstadoEnvio estado, 
                            String observacion) {
        this.idHistorialEntrega = idHistorialEntrega;
        this.fechaEvento = fechaEvento;
        this.estado = estado;
        this.observacion = observacion;
    }

    public String getIdHistorialEntrega() { 
        return idHistorialEntrega; 
    }

    public LocalDate getFechaEvento() { 
        return fechaEvento; 
    }

    public EstadoEnvio getEstado() { 
        return estado; 
    }

    public String getObservacion() { 
        return observacion; 
    }
}

