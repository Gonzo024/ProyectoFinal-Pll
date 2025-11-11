package co.edu.uniquindio.poo.model.patrones.factory;


public class ReporteFactory {
    
    /**
     * @param tipo "CSV" o "PDF"
     * @return La instancia del generador de reporte
     */
    public IReporte crearReporte(String tipo) {
        if (tipo.equalsIgnoreCase("CSV")) {
            return new ReporteCSV();
        } else if (tipo.equalsIgnoreCase("PDF")) {
            return new ReportePDF();
        }
        throw new IllegalArgumentException("Tipo de reporte no soportado: " + tipo);
    }
}