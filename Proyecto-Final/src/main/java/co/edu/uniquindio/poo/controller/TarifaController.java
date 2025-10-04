package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Prioridad;
import co.edu.uniquindio.poo.service.ITarifaService;

public class TarifaController {
    private final ITarifaService tarifaService;

    public TarifaController(ITarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }

    public double calcularCosto(double distancia, double peso, double volumen, Prioridad prioridad) {
        return tarifaService.calcularCosto(distancia, peso, volumen, prioridad);
    }
}
