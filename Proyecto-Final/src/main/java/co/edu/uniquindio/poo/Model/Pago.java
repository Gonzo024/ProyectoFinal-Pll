package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import co.edu.uniquindio.poo.model.patrones.strategy.IPagoStrategy; 

public class Pago {
    private String idPago;
    private double totalAPagar;
    private LocalDate fechaPago;
    private boolean aprobado;
    private Envio envio;
    private IPagoStrategy estrategiaPago;

    public Pago(String idPago, double totalAPagar, Envio envio) {
        this.idPago = idPago;
        this.totalAPagar = totalAPagar;
        this.envio = envio;
        this.aprobado = false; // Inicia como no aprobado
    }
    
    // 1. El servicio setea la estrategia
    public void setEstrategiaPago(IPagoStrategy estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    // 2. Se ejecuta el pago usando la estrategia seleccionada
    public boolean procesarPago() {
        if (estrategiaPago == null) {
            System.out.println("Error: No se ha seleccionado una estrategia de pago.");
            return false;
        }

        boolean exito = estrategiaPago.pagar(this.totalAPagar);
        if (exito) {
            this.aprobado = true;
            this.fechaPago = LocalDate.now();
            System.out.println("Pago " + idPago + " aprobado.");
        } else {
            System.out.println("Pago " + idPago + " rechazado.");
        }
        return exito;
    }


    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
}