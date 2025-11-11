package co.edu.uniquindio.poo.model;

public class Repartidor {
    private String idRepartidor;
    private String nombre;
    private String documento; 
    private String telefonoRepartidor;
    private DisponibilidadRepartidor disponibilidad;
    private String zonaCobertura; 

    public Repartidor(String idRepartidor, String nombre, String documento,
                      String telefonoRepartidor, String zonaCobertura) {

        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.documento = documento;
        this.telefonoRepartidor = telefonoRepartidor;
        this.zonaCobertura = zonaCobertura;
        this.disponibilidad = DisponibilidadRepartidor.INACTIVO; // Por defecto
    }


    public String getIdRepartidor() {
        return idRepartidor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefonoRepartidor() {
        return telefonoRepartidor;
    }

    public DisponibilidadRepartidor getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(DisponibilidadRepartidor disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    @Override
    public String toString() {
        return "Repartidor [id=" + idRepartidor + ", nombre=" + nombre + ", dispo=" + disponibilidad + "]";
    }
}