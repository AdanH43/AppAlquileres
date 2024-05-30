package com.politecnicomalaga.appalquileres.Control;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.R;

public class VehiculoViewHolder extends RecyclerView.ViewHolder {

    private final TextView tvMatricula;
    private final TextView tvModelo;
    private final TextView tvMarca;
    private final TextView tvTipoMotor;
    private final TextView tvKmsRecorridos;
    private final TextView tvPrecioDia;
    private VehiculoAdapter mAdapter;

    public VehiculoViewHolder(View itemView, VehiculoAdapter adapter) {
        super(itemView);
        mAdapter = adapter;
        tvMatricula = itemView.findViewById(R.id.matricula);
        tvModelo = itemView.findViewById(R.id.modelo);
        tvMarca = itemView.findViewById(R.id.marca);
        tvKmsRecorridos= itemView.findViewById(R.id.kmsRecorridos);
        tvPrecioDia = itemView.findViewById(R.id.PrecioDia);
        tvTipoMotor = itemView.findViewById(R.id.tipoMotor);

    }

    public void setTvMatricula(String matricula) {
        tvMatricula.setText(matricula);
    }

    public void setTvModelo(String modelo) {
        tvModelo.setText(modelo);
    }

    public void setTvMarca(String marca) {
        tvMarca.setText(marca);
    }

    public void setTvTipoMotor(String tipoMotor) {
        tvTipoMotor.setText(tipoMotor);
    }

    public void setTvKmsRecorridos(String kmsRecorridos) {
        tvKmsRecorridos.setText(kmsRecorridos);
    }

    public void setTvPrecioDia(String precioDia) {
        tvPrecioDia.setText(precioDia);
    }
}
