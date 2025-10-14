package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Admin;
import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.Repartidor;
import co.edu.uniquindio.poo.Service.IAdminService;

public class AdminController {
    private final IAdminService adminService;

    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }

    public void asignarEnvioARepartidor(Admin admin, Envio envio, Repartidor repartidor) {
        adminService.asignarEnvioARepartidor(admin, envio, repartidor);
    }
}
