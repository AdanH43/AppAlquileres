package com.politecnicomalaga.appalquileres.Control;

import com.politecnicomalaga.appalquileres.Model.Cliente;
import com.politecnicomalaga.appalquileres.Model.Vehiculo;

import java.util.HashMap;

public class MainController {
    private static MainController instance;
    private HashMap<String, Cliente> clientes;

    private HashMap<String, Vehiculo> vehiculos;
    private static MainController mySingleController;

    private MainController() {
        clientes = new HashMap<>();
        vehiculos = new HashMap<>();
    }

    public static MainController getSingleton() {
        if (MainController.mySingleController == null) {
            mySingleController = new MainController();
        }
        return mySingleController;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        clientes.put(cliente.getDni(), cliente);
    }

    public HashMap<String, Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getMatricula(), vehiculo);
    }

}

