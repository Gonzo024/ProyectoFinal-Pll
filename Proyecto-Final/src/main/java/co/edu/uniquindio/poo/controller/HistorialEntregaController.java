package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.HistorialEntrega;
import co.edu.uniquindio.poo.service.IHistorialEntregaService;

public class HistorialEntregaController {
    private final IHistorialEntregaService historialEntregaService;

    public HistorialEntregaController(IHistorialEntregaService historialEntregaService) {
        this.historialEntregaService = historialEntregaService;
    }

    public HistorialEntrega registrarEvento(String id, String observacion) {
        return historialEntregaService.registrarEvento(id, observacion);
    }
}
