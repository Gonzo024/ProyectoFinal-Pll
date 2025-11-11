package co.edu.uniquindio.poo.model.patrones.strategy;

// Simulación de pago con Tarjeta
public class PagoTarjetaStrategy implements IPagoStrategy {

    private String numeroTarjeta;
    private String nombreTitular;

    public PagoTarjetaStrategy(String numeroTarjeta, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Procesando pago con TARJETA " + numeroTarjeta + " por: " + monto);
        // Solo se aprueba si la tarjeta no es "0000"
        return !numeroTarjeta.startsWith("0000");
    }

    @Override
    public String getNombreEstrategia() {
        return "TarjetaCredito";
    }
}