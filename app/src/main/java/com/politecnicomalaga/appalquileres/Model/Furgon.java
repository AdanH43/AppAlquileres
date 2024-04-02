package com.politecnicomalaga.appalquileres.Model;

public class Furgon extends Vehiculo{

    private double cargaMaxima;
    private int plazasAsientos;

    public Furgon(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazasAsientos = plazasAsientos;
    }
}
