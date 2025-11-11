package co.edu.uniquindio.poo.model.patrones.factory;

import co.edu.uniquindio.poo.model.Envio;
import java.util.List;


public class ReportePDF implements IReporte {
    @Override
    public String generar(List<Envio> envios) {
        System.out.println("Generando Reporte PDF...");
        String pdf = "--- REPORTE PDF (simulado) ---\n";
        pdf += "Total Envíos: " + envios.size() + "\n";
        // (Aquí iría la lógica de PDFBox)
        return pdf;
    }
}