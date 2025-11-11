package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Pago;
import co.edu.uniquindio.poo.model.patrones.strategy.IPagoStrategy;

public interface IPagoService {
    /**
     * Procesa un pago 
     * @param envio El envío que se va a pagar
     * @param estrategia La estrategia de pago (Tarjeta, PSE, Efectivo)
     * @return El objeto Pago actualizado (aprobado o rechazado)
     */
    Pago procesarPago(Envio envio, IPagoStrategy estrategia);
}