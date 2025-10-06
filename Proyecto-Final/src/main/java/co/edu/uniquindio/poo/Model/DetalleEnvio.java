package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class DetalleEnvio {
    private String idDetalleEnvio;
    private LocalDate fechaCreacion;
    private LocalDate fechaEntrega;
    private double peso;
    private double volumen;
    private Tarifa tarifa;

    public DetalleEnvio(String idDetalleEnvio, LocalDate fechaCreacion, double peso, 
                        double volumen, Tarifa tarifa) {
        this.idDetalleEnvio = idDetalleEnvio;
        this.fechaCreacion = fechaCreacion;
        this.peso = peso;
        this.volumen = volumen;
        this.tarifa = tarifa;
    }

    
    public String getIdDetalleEnvio() { 
        return idDetalleEnvio; 
    }

    public LocalDate getFechaCreacion() { 
        return fechaCreacion; 
    }

    public LocalDate getFechaEntrega() { 
        return fechaEntrega; 
    }

    public void setFechaEntrega(LocalDate fechaEntrega) { 
        this.fechaEntrega = fechaEntrega; 
    }

    public double getPeso() { 
        return peso; 
    }

    public double getVolumen() { 
        return volumen; 
    }

    public Tarifa getTarifa() { 
        return tarifa; 
    }
}

