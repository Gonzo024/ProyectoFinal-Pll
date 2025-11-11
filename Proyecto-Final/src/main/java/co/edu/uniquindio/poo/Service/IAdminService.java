package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Repartidor;

public interface IAdminService {
    void asignarEnvioARepartidor(Admin admin, Envio envio, Repartidor repartidor);
}
