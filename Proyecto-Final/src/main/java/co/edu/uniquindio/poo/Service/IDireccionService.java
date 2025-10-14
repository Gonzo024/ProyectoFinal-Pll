package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Direccion;

public interface IDireccionService {
    Direccion registrarDireccion(String id, String calle, String ciudad, String coordenadas, String alias);
    Direccion buscarDireccionPorId(String id);
}
