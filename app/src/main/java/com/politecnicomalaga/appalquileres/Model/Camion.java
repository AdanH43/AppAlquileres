package com.politecnicomalaga.appalquileres.Model;

public class Camion extends Vehiculo {
    private double cargaMaxima;
    private double longitud;

    public Camion(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor, double cargaMaxima, double longitud) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getLongitud() {
        return longitud;
    }
}
