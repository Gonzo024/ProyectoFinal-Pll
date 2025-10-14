package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Direccion;
import co.edu.uniquindio.poo.Service.IDireccionService;

public class DireccionController {
    private final IDireccionService direccionService;

    public DireccionController(IDireccionService direccionService) {
        this.direccionService = direccionService;
    }

    public Direccion registrarDireccion(String id, String calle, String ciudad, String coordenadas, String alias) {
        return direccionService.registrarDireccion(id, calle, ciudad, coordenadas, alias);
    }

    public Direccion buscarDireccionPorId(String id) {
        return direccionService.buscarDireccionPorId(id);
    }
}

