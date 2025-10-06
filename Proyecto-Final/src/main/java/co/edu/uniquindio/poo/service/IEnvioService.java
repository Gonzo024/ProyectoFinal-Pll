package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.model.Direccion;
import co.edu.uniquindio.poo.model.Prioridad;

import java.time.LocalDate;

public interface IEnvioService {
    Envio crearEnvio(Usuario usuario, Direccion origen, Direccion destino, double peso, double volumen, Prioridad prioridad, LocalDate fecha);
    double calcularCostoEnvio(Envio envio);
}
