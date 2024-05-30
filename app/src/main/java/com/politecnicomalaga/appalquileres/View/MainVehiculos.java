package com.politecnicomalaga.appalquileres.View;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Control.MainController;
import com.politecnicomalaga.appalquileres.Control.VehiculoAdapter;
import com.politecnicomalaga.appalquileres.Model.Vehiculo;
import com.politecnicomalaga.appalquileres.R;

import java.util.HashMap;

public class MainVehiculos extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private VehiculoAdapter mAdapter;
    private HashMap<String, Vehiculo> mVehiculosMap;
    private Spinner spnTipoVehiculo;
    private EditText edtBuscarMatricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vehiculos);

        mRecyclerView = findViewById(R.id.rv_vehiculos);
        Button btnAddVehiculo = findViewById(R.id.btaddVehiculo);
        spnTipoVehiculo = findViewById(R.id.spinnerTipoVehiculo);
        edtBuscarMatricula = findViewById(R.id.edt_matricula);

        mVehiculosMap = MainController.getSingleton().getVehiculos();
        mAdapter = new VehiculoAdapter(this, mVehiculosMap);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnAddVehiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainVehiculos.this, MainAddVehiculos.class );
                startActivity(intent);
            }
        });

        edtBuscarMatricula.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                String filtro = s.toString().trim();
                if (filtro.length() >= 3) {
                    mAdapter.filtrarPorMatricula(filtro);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.updateData(MainController.getSingleton().getVehiculos());
        mAdapter.notifyDataSetChanged();
    }
}


