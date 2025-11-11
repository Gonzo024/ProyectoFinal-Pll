package co.edu.uniquindio.poo.model.patrones.strategy;

/**
 * Patrón de Comportamiento Strategy 
 * Interfaz unificada para todas las formas de pago.
 */
public interface IPagoStrategy {
    boolean pagar(double monto);
    String getNombreEstrategia();
}