package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.DetalleEnvio;
import co.edu.uniquindio.poo.service.IDetalleEnvioService;

public class DetalleEnvioController {
    private final IDetalleEnvioService detalleEnvioService;

    public DetalleEnvioController(IDetalleEnvioService detalleEnvioService) {
        this.detalleEnvioService = detalleEnvioService;
    }

    public DetalleEnvio buscarDetallePorId(String id) {
        return detalleEnvioService.buscarDetallePorId(id);
    }
}

