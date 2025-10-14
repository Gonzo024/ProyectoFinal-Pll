package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.HistorialEntrega;
import co.edu.uniquindio.poo.Service.IHistorialEntregaService;

public class HistorialEntregaController {
    private final IHistorialEntregaService historialEntregaService;

    public HistorialEntregaController(IHistorialEntregaService historialEntregaService) {
        this.historialEntregaService = historialEntregaService;
    }

    public HistorialEntrega registrarEvento(String id, String observacion) {
        return historialEntregaService.registrarEvento(id, observacion);
    }
}
