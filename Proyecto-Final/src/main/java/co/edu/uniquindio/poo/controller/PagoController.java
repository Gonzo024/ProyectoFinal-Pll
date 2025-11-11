package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Pago;
import co.edu.uniquindio.poo.model.patrones.strategy.IPagoStrategy; // Importar Patrón
import co.edu.uniquindio.poo.service.IPagoService;

public class PagoController {
    private final IPagoService pagoService;

    public PagoController(IPagoService pagoService) {
        this.pagoService = pagoService;
    }

    public Pago procesarPago(Envio envio, IPagoStrategy estrategia) {
        return pagoService.procesarPago(envio, estrategia);
    }
}