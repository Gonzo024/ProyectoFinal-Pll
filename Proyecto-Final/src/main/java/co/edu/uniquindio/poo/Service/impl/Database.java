package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Creacional Singleton 
 * Se usa Singleton para asegurar que solo haya UNA instancia de la "base de datos"
 * y que todos los servicios (UsuarioServiceImpl, EnvioServiceImpl, etc.) accedan a las MISMAS listas de datos.
 */

public class Database {
    private static Database instancia;

    //Constructor privado para evitar que se creen nuevas instancias fuera de esta clase.
     

    private Database() {
        usuarios = new ArrayList<>();
        repartidores = new ArrayList<>();
        envios = new ArrayList<>();
        tarifas = new ArrayList<>();
        // Tarifa base por defecto
        tarifas.add(new Tarifa("T-BASE", 1500, 500, 1000));
    }

    public static Database getInstance() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }


    // Listas que simulan las tablas de la base de datos
    private final List<Usuario> usuarios;
    private final List<Repartidor> repartidores;
    private final List<Envio> envios;
    private final List<Tarifa> tarifas;

    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }
    
    // Métodos de búsqueda simples (simulando la BD)
    
    public Usuario findUsuarioById(String id) {
        return usuarios.stream()
                .filter(u -> u.getIdUsuario().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public Repartidor findRepartidorById(String id) {
        return repartidores.stream()
                .filter(r -> r.getIdRepartidor().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public Envio findEnvioById(String id) {
        return envios.stream()
                .filter(e -> e.getIdEnvio().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public Tarifa getTarifaBase() {
        return tarifas.get(0); 
    }
}