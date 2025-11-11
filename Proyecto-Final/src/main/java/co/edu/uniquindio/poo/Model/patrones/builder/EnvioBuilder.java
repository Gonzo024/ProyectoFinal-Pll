package co.edu.uniquindio.poo.model.patrones.builder;

import co.edu.uniquindio.poo.model.*;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Permite construir el objeto complejo Envio paso a paso.
 * Es útil porque Envio tiene muchos atributos.
 */

public class EnvioBuilder {
    private Envio envio;
    private Tarifa tarifaBase; 

    public EnvioBuilder() {
        envio = new Envio();
        envio.setIdEnvio(UUID.randomUUID().toString()); 
        envio.setFechaCreacion(LocalDate.now());
    }

    public EnvioBuilder setUsuario(Usuario usuario) {
        envio.setUsuario(usuario);
        return this;
    }

    public EnvioBuilder setOrigen(Direccion origen) {
        envio.setOrigen(origen);
        return this;
    }

    public EnvioBuilder setDestino(Direccion destino) {
        envio.setDestino(destino);
        return this;
    }

    public EnvioBuilder setTarifaBase(Tarifa tarifa) {
        this.tarifaBase = tarifa;
        return this;
    }

    // Metodo para crear el detalle envio

    public EnvioBuilder setDetalles(double peso, double volumen, Prioridad prioridad) {
        String idDetalle = "DET-" + envio.getIdEnvio();
        DetalleEnvio detalle = new DetalleEnvio(idDetalle, envio.getFechaCreacion(), 
                                               peso, volumen, this.tarifaBase, prioridad);
        envio.setDetalleEnvio(detalle);
        return this;
    }

    public EnvioBuilder addServicioAdicional(ServicioAdicional servicio) {
        envio.addServicioAdicional(servicio);
        return this;
    }

    public Envio build() { 
        if (envio.getUsuario() == null || envio.getOrigen() == null || 
            envio.getDestino() == null || envio.getDetalleEnvio() == null) {
            throw new IllegalStateException("Faltan datos escenciales para crear el Envío (Usuario, Origen, Destino, Detalles)");
        }
        
        int dias = (envio.getDetalleEnvio().getPrioridad() == Prioridad.EXPRESS) ? 1 : 3;
        envio.setFechaEstimadaEntrega(LocalDate.now().plusDays(dias));

        return envio;
    }
}