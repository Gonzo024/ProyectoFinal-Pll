package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.Usuario;
import co.edu.uniquindio.poo.Model.Direccion;
import co.edu.uniquindio.poo.Model.Prioridad;

import java.time.LocalDate;

public interface IEnvioService {
    Envio crearEnvio(Usuario usuario, Direccion origen, Direccion destino, double peso, double volumen, Prioridad prioridad, LocalDate fecha);
    double calcularCostoEnvio(Envio envio);
}
