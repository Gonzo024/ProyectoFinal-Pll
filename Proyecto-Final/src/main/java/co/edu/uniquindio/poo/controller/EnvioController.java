package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.model.Direccion;
import co.edu.uniquindio.poo.model.Prioridad;
import co.edu.uniquindio.poo.service.IEnvioService;

import java.time.LocalDate;

public class EnvioController {
    private final IEnvioService envioService;

    public EnvioController(IEnvioService envioService) {
        this.envioService = envioService;
    }

    public Envio crearEnvio(Usuario usuario, Direccion origen, Direccion destino, double peso, double volumen, Prioridad prioridad, LocalDate fecha) {
        return envioService.crearEnvio(usuario, origen, destino, peso, volumen, prioridad, fecha);
    }

    public double calcularCostoEnvio(Envio envio) {
        return envioService.calcularCostoEnvio(envio);
    }
}
