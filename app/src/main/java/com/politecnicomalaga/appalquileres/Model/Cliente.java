package com.politecnicomalaga.appalquileres.Model;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private String numTarjetaCredito;


    public Cliente(String nombre, String apellidos, String email, String telefono, String dni, String numTarjetaCredito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.numTarjetaCredito = numTarjetaCredito;
    }
}
