package com.politecnicomalaga.appalquileres.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.R;

public class MainClientes extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_clientes);

        RecyclerView clientesRecycler = findViewById(R.id.rv_clientes);
        Button bt_clientes = findViewById(R.id.btAddCliente);
        EditText edt_apellido = findViewById(R.id.edt_apellido);

        bt_clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainClientes.this, MainAddClientes.class);

            }
        });










    }
}
