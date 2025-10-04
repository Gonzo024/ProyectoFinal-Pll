package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Pago implements IPagoEfectivo, IPagoPSE, IPagoTarjeta {
    private String idPago;
    private double totalAPagar;
    private LocalDate fechaPago;
    private boolean aprobado;
    private Envio envio;

    public Pago(String idPago, double totalAPagar, LocalDate fechaPago, boolean aprobado, Envio envio) {
        this.idPago = idPago;
        this.totalAPagar = totalAPagar;
        this.fechaPago = fechaPago;
        this.aprobado = aprobado;
        this.envio = envio;
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

   @Override
    public boolean pagar(double monto, String numeroTarjeta) {
        System.out.println("Procesando pago con tarjeta: " + numeroTarjeta);
        return monto <= totalAPagar;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Procesando pago en efectivo");
        return monto <= totalAPagar;
    }

    @Override
    public boolean pagar(double monto, String banco) {
        System.out.println("Procesando pago por PSE en el banco: " + banco);
        return monto <= totalAPagar;
    }
}
