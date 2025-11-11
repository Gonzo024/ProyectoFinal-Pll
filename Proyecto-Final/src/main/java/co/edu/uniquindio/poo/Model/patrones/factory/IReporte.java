package co.edu.uniquindio.poo.model.patrones.factory;

import co.edu.uniquindio.poo.model.Envio;
import java.util.List;

public interface IReporte {
    String generar(List<Envio> envios);
}