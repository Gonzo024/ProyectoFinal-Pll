package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Prioridad;
import co.edu.uniquindio.poo.model.ServicioAdicional;
import java.util.List;

public interface ITarifaService {
    /**
     * Calcula el costo total de un envío 
     * @param distancia Distancia en KM
     * @param peso Peso en KG
     * @param volumen Volumen en m3
     * @param prioridad NORMAL, RAPIDO, EXPRESS
     * @param servicios Lista de servicios adicionales (SEGURO, FRAGIL)
     * @return 
     */
    double calcularCosto(double distancia, double peso, double volumen,
                         Prioridad prioridad, List<ServicioAdicional> servicios);
}