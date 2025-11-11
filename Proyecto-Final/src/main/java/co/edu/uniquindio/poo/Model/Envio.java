package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Observable;

// Esta clase es el "Sujeto" en el patrón Observer
public class Envio extends Observable {
    private String idEnvio;
    private Direccion origen;
    private Direccion destino;
    private Usuario usuario;
    private Repartidor repartidor; 
    private EstadoEnvio estado;
    private DetalleEnvio detalleEnvio;
    private LocalDate fechaCreacion;
    private LocalDate fechaEstimadaEntrega;
    private double costo;
    private List<ServicioAdicional> serviciosAdicionales;

   
    public Envio() {
        this.serviciosAdicionales = new ArrayList<>();
        this.estado = EstadoEnvio.SOLICITADO; // Estado inicial
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Direccion getOrigen() {
        return origen;
    }

    public void setOrigen(Direccion origen) {
        this.origen = origen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
        // Notificar cambio de estado (Patrón Observer)
        setEstado(EstadoEnvio.ASIGNADO);
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    /**
     * Método clave para el patrón Observer.
     * Cada vez que el estado cambia, notifica a los observadores
     * (como el HistorialEntregaService).
     */
    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
        
        // Notificar a los Observadores
        setChanged();
        notifyObservers(this.estado); // Envía el nuevo estado
    }

    public DetalleEnvio getDetalleEnvio() {
        return detalleEnvio;
    }

    public void setDetalleEnvio(DetalleEnvio detalleEnvio) {
        this.detalleEnvio = detalleEnvio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(LocalDate fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<ServicioAdicional> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void addServicioAdicional(ServicioAdicional servicio) {
        this.serviciosAdicionales.add(servicio);
    }
}