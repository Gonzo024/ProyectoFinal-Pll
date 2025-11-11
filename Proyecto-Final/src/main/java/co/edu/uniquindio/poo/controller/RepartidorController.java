package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.DisponibilidadRepartidor;
import co.edu.uniquindio.poo.model.Repartidor;
import co.edu.uniquindio.poo.service.IRepartidorService;

public class RepartidorController {
    private final IRepartidorService repartidorService;

    public RepartidorController(IRepartidorService repartidorService) {
        this.repartidorService = repartidorService;
    }

    public Repartidor registrarRepartidor(String nombre, String documento, String telefono, String zonaCobertura) {
        return repartidorService.registrarRepartidor(nombre, documento, telefono, zonaCobertura);
    }

    public void actualizarDisponibilidad(String idRepartidor, DisponibilidadRepartidor disponibilidad) {
        repartidorService.actualizarDisponibilidad(idRepartidor, disponibilidad);
    
    }
}
