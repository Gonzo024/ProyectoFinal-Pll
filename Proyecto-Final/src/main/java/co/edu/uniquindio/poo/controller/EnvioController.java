package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.Usuario;
import co.edu.uniquindio.poo.Model.Direccion;
import co.edu.uniquindio.poo.Model.Prioridad;
import co.edu.uniquindio.poo.Service.IEnvioService;

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
