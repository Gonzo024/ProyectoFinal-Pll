package co.edu.uniquindio.poo.model.patrones.factory;

import co.edu.uniquindio.poo.model.Envio;
import java.util.List;

public class ReporteCSV implements IReporte {
    @Override
    public String generar(List<Envio> envios) {
        System.out.println("Generando Reporte CSV...");
        StringBuilder csv = new StringBuilder();
        csv.append("ID_ENVIO;USUARIO;ORIGEN;DESTINO;ESTADO;COSTO\n");
        for (Envio e : envios) {
            csv.append(e.getIdEnvio()).append(";")
               .append(e.getUsuario().getNombre()).append(";")
               .append(e.getOrigen().getCiudad()).append(";")
               .append(e.getDestino().getCiudad()).append(";")
               .append(e.getEstado()).append(";")
               .append(e.getCosto()).append("\n");
        }
        // ( lógica de PDF para guardar el archivo)
        return csv.toString();
    }
}