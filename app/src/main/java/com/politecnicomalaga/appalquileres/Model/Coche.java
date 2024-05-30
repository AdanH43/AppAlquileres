package com.politecnicomalaga.appalquileres.Model;

public class Coche extends Vehiculo {

    private String plazasMaximas;
    private String numPuertas;
    private String volumenMaletero;
    private TipoCoche tipoCoche;

    public enum TipoCoche {
        UTILITARIO, BERLINA, MONOVOLUMEN, SUV
    }

    public Coche(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor, String plazasMaximas, String numPuertas, String volumenMaletero, TipoCoche tipoCoche) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.plazasMaximas = plazasMaximas;
        this.numPuertas = numPuertas;
        this.volumenMaletero = volumenMaletero;
        this.tipoCoche = tipoCoche;
    }

    public String getPlazasMaximas() {
        return plazasMaximas;
    }

    public String getNumPuertas() {
        return numPuertas;
    }

    public String getVolumenMaletero() {
        return volumenMaletero;
    }

    public Enum getTipoCoche() {
        return tipoCoche;
    }
}
