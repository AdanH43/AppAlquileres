package com.politecnicomalaga.appalquileres.Model;

public class Furgon extends Vehiculo{

    private double cargaMaxima;
    private int plazasAsientos;

    public Furgon(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor, double cargaMaxima, int plazasAsientos) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazasAsientos = plazasAsientos;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public int getPlazasAsientos() {
        return plazasAsientos;
    }
}
