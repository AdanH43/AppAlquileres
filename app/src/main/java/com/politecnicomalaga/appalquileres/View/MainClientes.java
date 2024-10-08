package com.politecnicomalaga.appalquileres.View;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Control.ClienteAdapter;
import com.politecnicomalaga.appalquileres.Control.MainController;
import com.politecnicomalaga.appalquileres.Model.Cliente;
import com.politecnicomalaga.appalquileres.R;

import java.util.HashMap;

public class MainClientes extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ClienteAdapter mAdapter;
    private HashMap<String, Cliente> mHashMap;
    private static MainActivity myActiveActivity;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_clientes);

        mRecyclerView = findViewById(R.id.rv_clientes);
        Button bt_clientes = findViewById(R.id.btAddCliente);
        EditText edt_apellido = findViewById(R.id.edt_apellido);

        mHashMap = new HashMap<>();
        mAdapter = new ClienteAdapter(this, mHashMap);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        bt_clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainClientes.this, MainAddClientes.class);
                startActivity(intent);
            }
        });

        edt_apellido.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String filtro = s.toString().toLowerCase().trim();
                if (filtro.length() >= 4) {
                    mAdapter.filtrarApellido(filtro);
                }
                else if (filtro.length() == 0) {
                    mAdapter.resetFiltro();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.updateData(MainController.getSingleton().getClientes());
        mAdapter.notifyDataSetChanged();
    }
}