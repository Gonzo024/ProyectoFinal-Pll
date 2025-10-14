package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Pago;
import co.edu.uniquindio.poo.Model.Envio;

public interface IPagoService {
    Pago procesarPago(Envio envio, double monto, String metodo);
}
