package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Repartidor;
import co.edu.uniquindio.poo.Service.IRepartidorService;

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
