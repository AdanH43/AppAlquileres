package com.politecnicomalaga.appalquileres.Model;

public class Vehiculo {

    private String matricula;

    private String modelo;
    private String marca;
    private String kmsRecorrdidos;
    private String precioDia;
    private Enum tipoMotor;

    public Vehiculo(String matricula, String modelo, String marca, String kmsRecorrdidos, String precioDia, Enum tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kmsRecorrdidos = kmsRecorrdidos;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getKmsRecorrdidos() {
        return kmsRecorrdidos;
    }

    public String getPrecioDia() {
        return precioDia;
    }

    public Enum getTipoMotor() {
        return tipoMotor;
    }
}
