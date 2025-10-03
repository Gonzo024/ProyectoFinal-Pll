package co.edu.uniquindio.poo.Model;

public class Admin {
    private String idAdmin;
    private Usuario usuario;
    private Repartidor repartido;

    public Admin(Usuario usuario, Repartidor repartido) {
        this.usuario = usuario;
        this.repartido = repartido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Repartidor getRepartido() {
        return repartido;
    }

    public void setRepartido(Repartidor repartido) {
        this.repartido = repartido;
    }
}
