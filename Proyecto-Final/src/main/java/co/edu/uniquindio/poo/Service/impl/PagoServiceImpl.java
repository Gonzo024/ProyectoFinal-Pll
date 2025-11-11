package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.EstadoEnvio;
import co.edu.uniquindio.poo.model.Pago;
import co.edu.uniquindio.poo.model.patrones.strategy.IPagoStrategy;
import co.edu.uniquindio.poo.service.IPagoService;

import java.util.UUID;

public class PagoServiceImpl implements IPagoService {

    private final Database db = Database.getInstance();

    @Override
    public Pago procesarPago(Envio envio, IPagoStrategy estrategia) {
        
        String idPago = "PAGO-" + UUID.randomUUID().toString().substring(0, 4);
        Pago pago = new Pago(idPago, envio.getCosto(), envio);

        // 1. Asignar la estrategia de pago (Patrón Strategy)
        pago.setEstrategiaPago(estrategia);

        // 2. Ejecutar la estrategia
        boolean aprobado = pago.procesarPago();

        if (aprobado) {
            // 3. Si se aprueba, actualizar el estado del envío 
            Envio envioAPagar = db.findEnvioById(envio.getIdEnvio());
            if (envioAPagar != null) {
                envioAPagar.setEstado(EstadoEnvio.PAGADO); 
                
            }
        }
        
        return pago;
    }
}