package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.DetalleEnvio;
import co.edu.uniquindio.poo.Service.IDetalleEnvioService;

public class DetalleEnvioController {
    private final IDetalleEnvioService detalleEnvioService;

    public DetalleEnvioController(IDetalleEnvioService detalleEnvioService) {
        this.detalleEnvioService = detalleEnvioService;
    }

    public DetalleEnvio buscarDetallePorId(String id) {
        return detalleEnvioService.buscarDetallePorId(id);
    }
}

