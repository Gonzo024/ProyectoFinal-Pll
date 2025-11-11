package co.edu.uniquindio.poo.model;

// Enum para los servicios adicionales del envío.

public enum ServicioAdicional {
    SEGURO(5000), // Costo adicional por seguro
    FRAGIL(3000), // Costo adicional por manejo frágil
    FIRMA_REQUERIDA(2000); // Costo adicional por firma

    private final double costo;

    ServicioAdicional(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}