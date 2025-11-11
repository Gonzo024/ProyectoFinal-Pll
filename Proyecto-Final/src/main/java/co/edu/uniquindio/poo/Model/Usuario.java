package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private List<Envio> envios;
    private List<Direccion> direccionesFrecuentes;
    private List<MetodoPago> metodosPago;

    public Usuario(String idUsuario, String nombre, String correo, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.envios = new ArrayList<>();
        this.direccionesFrecuentes = new ArrayList<>();
        this.metodosPago = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getId() {
        return getIdUsuario();
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public List<Direccion> getDireccionesFrecuentes() {
        return direccionesFrecuentes;
    }

    public void agregarDireccion(Direccion direccion) {
        this.direccionesFrecuentes.add(direccion);
    }

    public List<MetodoPago> getMetodosPago() {
        return metodosPago;
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        this.metodosPago.add(metodo);
    }
}