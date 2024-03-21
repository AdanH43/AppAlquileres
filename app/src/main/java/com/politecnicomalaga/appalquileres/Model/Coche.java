package com.politecnicomalaga.appalquileres.Model;

public class Coche extends Vehiculo {

    private String plazasMaximas;
    private String numPuertas;
    private String volumenMaletero;
    private Enum tipoCoche;

    public Coche(String matricula, String modelo, String marca, String kmsRecorrdidos, String precioDia, Enum tipoMotor) {
        super(matricula, modelo, marca, kmsRecorrdidos, precioDia, tipoMotor);
    }

    public Coche(String matricula, String modelo, String marca, String kmsRecorrdidos, String precioDia, Enum tipoMotor, String plazasMaximas, String numPuertas, String volumenMaletero, Enum tipoCoche) {
        super(matricula, modelo, marca, kmsRecorrdidos, precioDia, tipoMotor);
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
