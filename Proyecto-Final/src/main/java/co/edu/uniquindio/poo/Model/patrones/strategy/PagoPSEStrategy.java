package co.edu.uniquindio.poo.model.patrones.strategy;

// Simulación de pago con PSE
public class PagoPSEStrategy implements IPagoStrategy {

    private String banco;

    public PagoPSEStrategy(String banco) {
        this.banco = banco;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Procesando pago con PSE (" + banco + ") por: " + monto);
        // siempre se aprueba
        return true;
    }

    @Override
    public String getNombreEstrategia() {
        return "PSE";
    }
}