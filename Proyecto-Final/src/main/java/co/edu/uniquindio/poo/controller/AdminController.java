package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Repartidor;
import co.edu.uniquindio.poo.service.IAdminService;

public class AdminController {
    private final IAdminService adminService;

    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }

    public void asignarEnvioARepartidor(Admin admin, Envio envio, Repartidor repartidor) {
        adminService.asignarEnvioARepartidor(admin, envio, repartidor);
    }
}
