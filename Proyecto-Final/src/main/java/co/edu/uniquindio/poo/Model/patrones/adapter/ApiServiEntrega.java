package co.edu.uniquindio.poo.model.patrones.adapter;

public class ApiServiEntrega {
   
    public int solicitarRecogida(String xmlRequest) {
        System.out.println("[ApiServiEntrega] Recibiendo solicitud XML: " + xmlRequest);
        return 201; 
    }
}