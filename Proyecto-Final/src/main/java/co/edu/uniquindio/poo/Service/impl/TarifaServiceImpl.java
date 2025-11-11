package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.Prioridad;
import co.edu.uniquindio.poo.model.ServicioAdicional;
import co.edu.uniquindio.poo.model.Tarifa;
import co.edu.uniquindio.poo.service.ITarifaService;

import java.util.List;

public class TarifaServiceImpl implements ITarifaService {

    private final Database db = Database.getInstance();

    @Override
    public double calcularCosto(double distancia, double peso, double volumen, 
                                Prioridad prioridad, List<ServicioAdicional> servicios) {
        
        // 1. Obtener la tarifa base 
        Tarifa tarifaBase = db.getTarifaBase();
        if (tarifaBase == null) {
            throw new IllegalStateException("No hay tarifas base configuradas.");
        }

        // 2. Cálculo base 
        double costoBase = tarifaBase.getBasePorKm() * distancia;
        double costoPeso = tarifaBase.getFactorPeso() * peso;
        double costoVolumen = tarifaBase.getFactorVolumen() * volumen;

        // 3. Factor de Prioridad 
        double multiplicadorPrioridad = 1.0;
        if (prioridad == Prioridad.RAPIDO) {
            multiplicadorPrioridad = 1.5; // 50% más caro
        } else if (prioridad == Prioridad.EXPRESS) {
            multiplicadorPrioridad = 2.0; // 100% más caro
        }

        // 4. Servicios Adicionales 
        double costoServicios = 0;
        for (ServicioAdicional servicio : servicios) {
            costoServicios += servicio.getCosto();
        }

        // 5. Costo Total
        double costoTotal = (costoBase + costoPeso + costoVolumen) * multiplicadorPrioridad + costoServicios;
        
        System.out.println("Costo cotizado: " + costoTotal);
        return costoTotal;
    }
}