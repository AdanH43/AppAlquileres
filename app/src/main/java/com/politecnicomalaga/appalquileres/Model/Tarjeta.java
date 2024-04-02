package com.politecnicomalaga.appalquileres.Model;

import java.util.List;

public class Tarjeta {
    private String numero_Tarjeta;
    private String fechaCaducidad;
    private String cvv;


    public Tarjeta(String numero_Tarjeta, String fechaCaducidad, String cvv) {
        this.numero_Tarjeta = numero_Tarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
    }

    public String getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getCvv() {
        return cvv;
    }

}
