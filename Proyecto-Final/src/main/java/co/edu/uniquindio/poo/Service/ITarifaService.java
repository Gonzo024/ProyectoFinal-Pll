package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Prioridad;

public interface ITarifaService {
    double calcularCosto(double distancia, double peso, double volumen, 
                        Prioridad prioridad);
}
