package co.edu.uniquindio.poo.dto;

import co.edu.uniquindio.poo.model.EstadoEnvio;
import java.time.LocalDate;

/**
 * Patrón Estructural: Data Transfer Object (DTO) (RF-040)
 * * Esta clase sirve para transferir datos de forma segura entre la lógica (service)
 * y la presentación (JavaFX). Evita que la vista manipule el objeto real (Envio).
 */
public class EnvioDTO {
    
    private final String idEnvio;
    private final String nombreUsuario;
    private final String origen; // calle, ciudad
    private final String destino; // calle, ciudad
    private final EstadoEnvio estado;
    private final LocalDate fechaEstimada;

    public EnvioDTO(String idEnvio, String nombreUsuario, String origen, 
                    String destino, EstadoEnvio estado, LocalDate fechaEstimada) {
        this.idEnvio = idEnvio;
        this.nombreUsuario = nombreUsuario;
        this.origen = origen;
        this.destino = destino;
        this.estado = estado;
        this.fechaEstimada = fechaEstimada;
    }

    
    public String getIdEnvio() {
        return idEnvio;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public LocalDate getFechaEstimada() {
        return fechaEstimada;
    }
}