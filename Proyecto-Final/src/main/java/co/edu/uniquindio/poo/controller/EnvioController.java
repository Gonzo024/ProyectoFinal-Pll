package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.patrones.builder.EnvioBuilder; // Importar Patrón
import co.edu.uniquindio.poo.service.IEnvioService;

public class EnvioController {
    private final IEnvioService envioService;

    public EnvioController(IEnvioService envioService) {
        this.envioService = envioService;
    }

    public Envio crearEnvio(EnvioBuilder builder) {
        return envioService.crearEnvio(builder);
    }

}