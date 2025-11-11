package co.edu.uniquindio.poo.model.patrones.strategy;

// Simulación de pago en efectivo
public class PagoEfectivoStrategy implements IPagoStrategy {
    
    @Override
    public boolean pagar(double monto) {
        System.out.println("Procesando pago en EFECTIVO por: " + monto);
        return true; 
    }

    @Override
    public String getNombreEstrategia() {
        return "Efectivo";
    }
}