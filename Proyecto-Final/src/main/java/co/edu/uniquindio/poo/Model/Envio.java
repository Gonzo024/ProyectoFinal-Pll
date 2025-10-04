package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Envio {
    private String idEnvio;
    private Direccion origen;
    private Direccion destino;
    private Usuario usuario;
    private Repartidor repartidor;
    private LocalDate fecha;
    private EstadoEnvio estado;
    private DetalleEnvio detalleEnvio;

    public Envio(String idEnvio, Direccion origen, Direccion destino,
                 Usuario usuario, LocalDate fecha, EstadoEnvio estado) {
        this.idEnvio = idEnvio;
        this.origen = origen;
        this.destino = destino;
        this.usuario = usuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getIdEnvio() { 
        return idEnvio; 
    }

    public Direccion getOrigen() { 
        return origen; 
    }

    public Direccion getDestino() { 
        return destino; 
    }

    public Usuario getUsuario() { 
        return usuario; 
    }

    public Repartidor getRepartidor() { 
        return repartidor; 
    }

    public void setRepartidor(Repartidor repartidor) { 
        this.repartidor = repartidor; 
    }

    public EstadoEnvio getEstado() { 
        return estado; 
    }

    public void setEstado(EstadoEnvio estado) { 
        this.estado = estado; 
    }

    public DetalleEnvio getDetalleEnvio() { 
        return detalleEnvio; 
    }

    public void setDetalleEnvio(DetalleEnvio detalleEnvio) { 
        this.detalleEnvio = detalleEnvio; 
    }
}
