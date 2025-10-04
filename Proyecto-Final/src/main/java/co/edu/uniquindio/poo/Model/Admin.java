package co.edu.uniquindio.poo.model;

public class Admin {
    private String idAdmin;
    private Usuario usuario;
    private Repartidor repartidor;

    public Admin(String idAdmin, Usuario usuario, Repartidor repartidor) {
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.repartidor = repartidor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Repartidor getRepartido() {
        return repartidor;
    }

    public void setRepartido(Repartidor repartido) {
        this.repartidor = repartido;
    }
}
