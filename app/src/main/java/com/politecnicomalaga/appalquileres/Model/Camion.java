package com.politecnicomalaga.appalquileres.Model;

public class Camion extends Vehiculo {


    public Camion(String matricula, String modelo, String marca, String kmsRecorrdidos, String precioDia, Enum tipoMotor) {
        super(matricula, modelo, marca, kmsRecorrdidos, precioDia, tipoMotor);
    }
}
