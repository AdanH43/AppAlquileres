package com.politecnicomalaga.appalquileres.Model;

import java.util.HashMap;
import java.util.Map;

public class Vehiculo {

    private Map<String, Vehiculo> mapaVehiculos = new HashMap<>();
    private String matricula;
    private String modelo;
    private String marca;
    private double kmsRecorridos;
    private double precioDia;
    private TipoMotor tipoMotor;

    public enum TipoMotor {
        ELECTRICO, HIBRIDO_ENCHUFABLE, HIBRIDO, GASOLINA, DIESEL
    }

    public Vehiculo(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, TipoMotor tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kmsRecorridos = kmsRecorridos;
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

    public double getKmsRecorridos() {
        return kmsRecorridos;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public Map<String, Vehiculo> getMapaVehiculos() {
        return mapaVehiculos;
    }
}
