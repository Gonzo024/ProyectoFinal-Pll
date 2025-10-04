package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Prioridad;

public interface ITarifaService {
    double calcularCosto(double distancia, double peso, double volumen, 
                        Prioridad prioridad);
}
