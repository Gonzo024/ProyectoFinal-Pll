package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.EstadoEnvio;
import co.edu.uniquindio.poo.model.Repartidor;
import co.edu.uniquindio.poo.service.IAdminService;

public class AdminServiceImpl implements IAdminService {

    private final Database db = Database.getInstance();

    @Override
    public void asignarEnvioARepartidor(Admin admin, Envio envio, Repartidor repartidor) {
        if (envio == null || repartidor == null) {
            System.out.println("Error: Envío o Repartidor nulos.");
            return;
        }

        Envio envioDB = db.findEnvioById(envio.getIdEnvio());
        if (envioDB == null) {
            System.out.println("Error: Envío no encontrado en DB.");
            return;
        }
        
        if (envioDB.getEstado() == EstadoEnvio.PAGADO) {
            envioDB.setRepartidor(repartidor); 
            System.out.println("Envío " + envio.getIdEnvio() + " asignado a " + repartidor.getNombre());
        } else {
            System.out.println("Error: El envío no se puede asignar (Estado: " + envioDB.getEstado() + ")");
        }
    }
}