package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Prioridad;
import co.edu.uniquindio.poo.Service.ITarifaService;

public class TarifaController {
    private final ITarifaService tarifaService;

    public TarifaController(ITarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }

    public double calcularCosto(double distancia, double peso, double volumen, Prioridad prioridad) {
        return tarifaService.calcularCosto(distancia, peso, volumen, prioridad);
    }
}
