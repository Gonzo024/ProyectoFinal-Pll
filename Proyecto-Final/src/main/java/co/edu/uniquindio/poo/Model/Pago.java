package co.edu.uniquindio.poo.Model;

import java.time.LocalDate;

public class Pago implements IPagoPSE, IPagoTarjeta, IPagoEfectivo  {
    private String idPago;
    private double totalAPagar;
    private LocalDate fechaPago;
    private boolean aprobado;

    
}
