package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Repartidor;

public interface IRepartidorService {
    Repartidor registrarRepartidor(String nombre, String telefono, String zonaCobertura);
    void actualizarDisponibilidad(String idRepartidor, boolean disponible);
}
