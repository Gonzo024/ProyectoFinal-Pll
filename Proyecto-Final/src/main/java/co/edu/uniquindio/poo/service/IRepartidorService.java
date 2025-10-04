package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Repartidor;

public interface IRepartidorService {
    Repartidor registrarRepartidor(String nombre, String telefono, String zonaCobertura);
    void actualizarDisponibilidad(String idRepartidor, boolean disponible);
}
