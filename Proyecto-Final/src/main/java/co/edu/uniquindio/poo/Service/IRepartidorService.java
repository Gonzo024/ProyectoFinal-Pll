package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.DisponibilidadRepartidor;
import co.edu.uniquindio.poo.model.Repartidor;
import java.util.List;

public interface IRepartidorService {
    Repartidor registrarRepartidor(String nombre, String documento, String telefono, String zonaCobertura);
    void actualizarDisponibilidad(String idRepartidor, DisponibilidadRepartidor disponibilidad); // (RF-020)
    Repartidor buscarRepartidor(String idRepartidor);
    List<Repartidor> listarRepartidores();
    List<Repartidor> buscarDisponiblesPorZona(String zona);
}