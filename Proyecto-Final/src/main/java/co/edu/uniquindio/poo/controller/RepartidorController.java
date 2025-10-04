package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Repartidor;
import co.edu.uniquindio.poo.service.IRepartidorService;

public class RepartidorController {
    private final IRepartidorService repartidorService;

    public RepartidorController(IRepartidorService repartidorService) {
        this.repartidorService = repartidorService;
    }

    public Repartidor registrarRepartidor(String nombre, String telefono, String zonaCobertura) {
        return repartidorService.registrarRepartidor(nombre, telefono, zonaCobertura);
    }

    public void actualizarDisponibilidad(String idRepartidor, boolean disponible) {
        repartidorService.actualizarDisponibilidad(idRepartidor, disponible);
    }
}
