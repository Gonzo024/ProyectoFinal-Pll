package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private List<Envio> envios; 

    public Usuario(String idUsuario, String nombre, String correo, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.envios = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setId(String idUsuario) {
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
}
