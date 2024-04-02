package com.politecnicomalaga.appalquileres.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {

    private String nombreEmpresa;
    private Map<String,Cliente> mapaClientes = new HashMap<>();

    private Map<String, Vehiculo> mapaVehiculos = new HashMap<>();

    public Empresa(Map<String, Cliente> mapaClientes) {
        this.nombreEmpresa = "Alquila Car";
        this.mapaClientes = mapaClientes;
    }

    public void darAltaCliente(String nombre, String apellidos, String email, String telefono, String dni, List<Tarjeta> listaTarjetas) {
        Cliente cliente = new Cliente(nombre, apellidos, email, telefono, dni, listaTarjetas);
        mapaClientes.put(apellidos, cliente);
    }

    public void darAltaVehiculo(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, Vehiculo.TipoMotor tipoMotor) {
        Vehiculo vehiculo = new Vehiculo(matricula,modelo,marca,0,precioDia, tipoMotor);
        mapaVehiculos.put(matricula,vehiculo);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public Map<String, Cliente> getMapaClientes() {
        return mapaClientes;
    }

    public Map<String, Vehiculo> getMapaVehiculos() {
        return mapaVehiculos;
    }
}
