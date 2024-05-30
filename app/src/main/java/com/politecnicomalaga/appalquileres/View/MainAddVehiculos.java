package com.politecnicomalaga.appalquileres.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.politecnicomalaga.appalquileres.Control.MainController;
import com.politecnicomalaga.appalquileres.Model.Camion;
import com.politecnicomalaga.appalquileres.Model.Coche;
import com.politecnicomalaga.appalquileres.Model.Furgon;
import com.politecnicomalaga.appalquileres.Model.Vehiculo;
import com.politecnicomalaga.appalquileres.R;


public class MainAddVehiculos extends AppCompatActivity {
    private EditText edtMatricula, edtModelo, edtMarca, edtKmsRecorridos, edtPrecioDia, edtAtributo1, edtAtributo2;
    private Spinner spnTipoMotor, spnTipoVehiculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_add_vehiculo);

        edtMatricula = findViewById(R.id.edtMatricula);
        edtModelo = findViewById(R.id.edtModelo);
        edtMarca = findViewById(R.id.edtMarca);
        edtKmsRecorridos = findViewById(R.id.edtKmsRecorridos);
        edtPrecioDia = findViewById(R.id.edtPrecioDia);
        edtAtributo1 = findViewById(R.id.edtAtributo1);
        edtAtributo2 = findViewById(R.id.edtAtributo2);
        spnTipoMotor = findViewById(R.id.spnTipoMotor);
        spnTipoVehiculo = findViewById(R.id.spnTipoVehiculo);
        Button btnSaveVehiculo = findViewById(R.id.btnSaveVehiculo);
        btnSaveVehiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricula = edtMatricula.getText().toString().trim();
                String modelo = edtModelo.getText().toString().trim();
                String marca = edtMarca.getText().toString().trim();
                double kmsRecorridos = Double.parseDouble(edtKmsRecorridos.getText().toString().trim());
                double precioDia = Double.parseDouble(edtPrecioDia.getText().toString().trim());
                Vehiculo.TipoMotor tipoMotor = Vehiculo.TipoMotor.valueOf(spnTipoMotor.getSelectedItem().toString().toUpperCase());
                String tipoVehiculo = spnTipoVehiculo.getSelectedItem().toString();

                Vehiculo vehiculo;
                switch (tipoVehiculo.toLowerCase()) {
                    case "coche":
                        String plazasMaximas = edtAtributo1.getText().toString().trim();
                        String numPuertas = edtAtributo2.getText().toString().trim();
                        vehiculo = new Coche(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor, plazasMaximas, numPuertas, "", Coche.TipoCoche.UTILITARIO);
                        break;
                    case "furgón":
                        double cargaMaxima = Double.parseDouble(edtAtributo1.getText().toString().trim());
                        int plazasAsientos = Integer.parseInt(edtAtributo2.getText().toString().trim());
                        vehiculo = new Furgon(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor, cargaMaxima, plazasAsientos);
                        break;
                    case "camión":
                        double carga = Double.parseDouble(edtAtributo1.getText().toString().trim());
                        double longitud = Double.parseDouble(edtAtributo2.getText().toString().trim());
                        vehiculo = new Camion(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor, carga, longitud);
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de vehículo desconocido");
                }

                MainController.getSingleton().addVehiculo(vehiculo);
                finish();
            }
        });
    }
}


