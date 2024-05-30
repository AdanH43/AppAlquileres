package com.politecnicomalaga.appalquileres.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Control.MainController;
import com.politecnicomalaga.appalquileres.Model.Cliente;
import com.politecnicomalaga.appalquileres.R;

public class MainAddClientes extends AppCompatActivity {

    private EditText editTextNombre, editTextApellidos, editTextEmail, editTextTelefono, editTextDNI;
    private Button btnCrearCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_addclientes);


        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextDNI = findViewById(R.id.editTextDNI);
        btnCrearCliente = findViewById(R.id.btnCrearCliente);

        btnCrearCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                String apellidos = editTextApellidos.getText().toString();
                String email = editTextEmail.getText().toString();
                String telefono = editTextTelefono.getText().toString();
                String dni = editTextDNI.getText().toString();

                Cliente nuevoCliente = new Cliente(nombre, apellidos, email, telefono, dni);
                MainController.getSingleton().addCliente(nuevoCliente);
                finish();
            }
        });


    }
}


