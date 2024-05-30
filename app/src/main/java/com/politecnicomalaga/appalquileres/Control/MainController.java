package com.politecnicomalaga.appalquileres.Control;

import com.politecnicomalaga.appalquileres.Model.Cliente;

import java.util.HashMap;

public class MainController {
    private static MainController instance;
    private HashMap<String, Cliente> clientes;
    private static MainController mySingleController;

    private MainController() {
        clientes = new HashMap<>();
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
}

