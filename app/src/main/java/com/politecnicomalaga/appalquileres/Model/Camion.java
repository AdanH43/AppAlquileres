package com.politecnicomalaga.appalquileres.Model;

public class Camion extends Vehiculo {
    private double cargaMaxima;
    private double longitud;
    public Camion(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }
}
