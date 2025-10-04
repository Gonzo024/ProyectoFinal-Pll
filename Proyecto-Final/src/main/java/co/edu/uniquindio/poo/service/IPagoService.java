package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Pago;
import co.edu.uniquindio.poo.model.Envio;

public interface IPagoService {
    Pago procesarPago(Envio envio, double monto, String metodo);
}
