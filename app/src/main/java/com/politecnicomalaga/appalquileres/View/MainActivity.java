package com.politecnicomalaga.appalquileres.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.politecnicomalaga.appalquileres.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainClientes = findViewById(R.id.btnMainClientes);
        Button mainVehiculos = findViewById(R.id.btnMainVehiculos);
        mainClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainClientes.class);
                startActivity(intent);
            }
        });

        mainVehiculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainVehiculos.class);
                startActivity(intent);

            }
        });
    }
}