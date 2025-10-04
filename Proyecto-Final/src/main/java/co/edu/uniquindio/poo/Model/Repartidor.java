package co.edu.uniquindio.poo.model;

public class Repartidor {
    private String idRepartidor;
    private String nombre;
    private String idPersonal;
    private String telefonoRepartidor;
    private boolean disponible;
    private Envio envio;
    private String zonaCobertura;

    public Repartidor(String idRepartidor, String nombre, String idPersonal,
                      String telefonoRepartidor, boolean disponible,
                      Envio envio, String zonaCobertura) {

        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.idPersonal = idPersonal;
        this.telefonoRepartidor = telefonoRepartidor;
        this.disponible = disponible;
        this.envio = envio;
        this.zonaCobertura = zonaCobertura;
    }

}
