package com.politecnicomalaga.appalquileres.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private List<Tarjeta> listaTarjetas;


    public Cliente(String nombre, String apellidos, String email, String telefono, String dni, List<Tarjeta> listaTarjetas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.listaTarjetas = listaTarjetas;
    }

    public void añadirTarjeta(Tarjeta tarjeta) {
        listaTarjetas.add(tarjeta);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public List<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }
}
