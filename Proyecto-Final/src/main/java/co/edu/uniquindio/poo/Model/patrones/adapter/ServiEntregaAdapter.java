package co.edu.uniquindio.poo.model.patrones.adapter;

import co.edu.uniquindio.poo.model.Envio;

public class ServiEntregaAdapter implements IServicioLogisticaExterno {

    private final ApiServiEntrega apiExterna;

    public ServiEntregaAdapter() {
        this.apiExterna = new ApiServiEntrega(); 
    }

    @Override
    public boolean programarEnvio(Envio envio) {
        // 1. TRADUCCIÓN: Convertimos nuestro objeto Envio a lo que la API espera (XML)
        String xml = convertirEnvioAXml(envio);
        
        // 2. LLAMADA: Usamos la API externa
        int statusCode = apiExterna.solicitarRecogida(xml);
        
        // 3. TRADUCCIÓN (de vuelta): Convertimos su respuesta (int) a la nuestra (boolean)
        return statusCode == 201;
    }

    private String convertirEnvioAXml(Envio envio) {
        // Simulación de conversión
        return String.format("<envio><origen>%s</origen><destino>%s</destino></envio>",
                envio.getOrigen().getCiudad(), envio.getDestino().getCiudad());
    }
}