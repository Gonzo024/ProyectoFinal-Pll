package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Direccion;

public interface IDireccionService {
    Direccion registrarDireccion(String id, String calle, String ciudad, String coordenadas, String alias);
    Direccion buscarDireccionPorId(String id);
}
