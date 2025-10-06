package co.edu.uniquindio.poo.model;

public class Direccion {
    private String idDireccion;
    private String calle;
    private String ciudad;
    private String coordenadasSimuladas; 
    private String alias; // ej: "Casa", "Trabajo"

    public Direccion(String idDireccion, String calle, String ciudad, String coordenadasSimuladas, 
                    String alias) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.coordenadasSimuladas = coordenadasSimuladas;
        this.alias = alias;
    }

    public String getIdDireccion() { 
        return idDireccion; 
    }

    public void setIdDireccion(String idDireccion) { 
        this.idDireccion = idDireccion; 
    }

    public String getCalle() { 
        return calle; 
    }

    public void setCalle(String calle) { 
        this.calle = calle; 
    }

    public String getCiudad() { 
        return ciudad; 
    }

    public void setCiudad(String ciudad) { 
        this.ciudad = ciudad; 
    }

    public String getCoordenadasSimuladas() { 
        return coordenadasSimuladas; 
    }

    public void setCoordenadasSimuladas(String coordenadasSimuladas) { 
        this.coordenadasSimuladas = coordenadasSimuladas; 
    }

    public String getAlias() { 
        return alias; 
    }

    public void setAlias(String alias) { 
        this.alias = alias; 
    }
}

