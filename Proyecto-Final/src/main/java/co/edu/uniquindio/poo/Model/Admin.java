package co.edu.uniquindio.poo.Model;

public class Admin {
    private String idAdmin;
    private co.edu.uniquindio.poo.Model.Usuario usuario;
    private co.edu.uniquindio.poo.Model.Repartidor repartidor;

    public Admin(String idAdmin, co.edu.uniquindio.poo.Model.Usuario usuario, Repartidor repartidor) {
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
