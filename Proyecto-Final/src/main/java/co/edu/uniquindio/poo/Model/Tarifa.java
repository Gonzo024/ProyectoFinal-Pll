package co.edu.uniquindio.poo.model;

public class Tarifa {
    private String idTarifa;
    private double basePorKm;
    private double factorPeso;
    private double factorVolumen;

    public Tarifa(String idTarifa, double basePorKm, double factorPeso, double factorVolumen) {
        this.idTarifa = idTarifa;
        this.basePorKm = basePorKm;
        this.factorPeso = factorPeso;
        this.factorVolumen = factorVolumen;
    }

    public String getIdTarifa() { 
        return idTarifa; 
    }

    public double getBasePorKm() { 
        return basePorKm; 
    }

    public double getFactorPeso() { 
        return factorPeso; 
    }

    public double getFactorVolumen() { 
        return factorVolumen; 
    }
}

