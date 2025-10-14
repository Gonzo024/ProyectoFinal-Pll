package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.Pago;
import co.edu.uniquindio.poo.Service.IPagoService;

public class PagoController {
    private final IPagoService pagoService;

    public PagoController(IPagoService pagoService) {
        this.pagoService = pagoService;
    }

    public Pago procesarPago(String idPago, Envio envio, double monto, String metodo) {
        return pagoService.procesarPago(idPago, envio, monto, metodo);
    }
}

