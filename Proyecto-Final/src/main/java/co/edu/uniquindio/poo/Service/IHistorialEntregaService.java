package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.HistorialEntrega;
import java.util.Observer; 

public interface IHistorialEntregaService extends Observer {
    
    HistorialEntrega registrarEvento(String id, String observacion);
}