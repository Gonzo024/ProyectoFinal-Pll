package co.edu.uniquindio.poo.model;

public class MetodoPago {
    private String idMetodo;
    private String alias; // Ej: "Tarjeta_Primaria"
    private String detalles; // Ej: "Visa terminada en 1234"

    public MetodoPago(String idMetodo, String alias, String detalles) {
        this.idMetodo = idMetodo;
        this.alias = alias;
        this.detalles = detalles;
    }

    public String getIdMetodo() {
        return idMetodo;
    }

    public String getAlias() {
        return alias;
    }

    public String getDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return "MetodoPago [alias=" + alias + ", detalles=" + detalles + "]";
    }
}