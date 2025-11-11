package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.DisponibilidadRepartidor;
import co.edu.uniquindio.poo.model.Repartidor;
import co.edu.uniquindio.poo.service.IRepartidorService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class RepartidorServiceImpl implements IRepartidorService {

    // Usar la base de datos Singleton
    private final Database db = Database.getInstance();

    @Override
    public Repartidor registrarRepartidor(String nombre, String documento, String telefono, String zonaCobertura) {
        String idRepartidor = "REP-" + UUID.randomUUID().toString().substring(0, 4);
        Repartidor repartidor = new Repartidor(idRepartidor, nombre, documento, telefono, zonaCobertura);
        
        db.getRepartidores().add(repartidor);
        System.out.println("Repartidor registrado: " + repartidor.getNombre());
        return repartidor;
    }

    @Override
    public void actualizarDisponibilidad(String idRepartidor, DisponibilidadRepartidor disponibilidad) {
        Repartidor r = db.findRepartidorById(idRepartidor);
        if (r != null) {
            r.setDisponibilidad(disponibilidad);
            System.out.println("Disponibilidad de " + r.getNombre() + " actualizada a " + disponibilidad);
        }
    }

    @Override
    public Repartidor buscarRepartidor(String idRepartidor) {
        return db.findRepartidorById(idRepartidor);
    }

    @Override
    public List<Repartidor> listarRepartidores() {
        return db.getRepartidores();
    }

    @Override
    public List<Repartidor> buscarDisponiblesPorZona(String zona) {
        return db.getRepartidores().stream()
                .filter(r -> r.getZonaCobertura().equalsIgnoreCase(zona) && 
                             r.getDisponibilidad() == DisponibilidadRepartidor.ACTIVO)
                .collect(Collectors.toList());
    }
}