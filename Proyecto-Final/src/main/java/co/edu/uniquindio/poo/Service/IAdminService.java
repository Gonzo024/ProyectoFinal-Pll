package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Admin;
import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.Repartidor;

public interface IAdminService {
    void asignarEnvioARepartidor(Admin admin, Envio envio, Repartidor repartidor);
}
