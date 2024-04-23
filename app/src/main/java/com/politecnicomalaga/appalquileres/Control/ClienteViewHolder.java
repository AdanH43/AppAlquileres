package com.politecnicomalaga.appalquileres.Control;

import android.nfc.TagLostException;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.R;

public class ClienteViewHolder extends RecyclerView.ViewHolder {

    final ClienteAdapter myAdapter;
    private TextView tvNombre;
    private TextView tvApellidos;
    private TextView tvDni;
    private TextView tvTelefono;
    private TextView tvEmail;


    public ClienteViewHolder(@NonNull View itemView, ClienteAdapter myAdapter) {
        super(itemView);
        tvNombre = itemView.findViewById(R.id.nombre);
        tvApellidos = itemView.findViewById(R.id.apellidos);
        tvDni = itemView.findViewById(R.id.dni);
        tvTelefono = itemView.findViewById(R.id.telefono);
        tvEmail = itemView.findViewById(R.id.email);
        this.myAdapter = myAdapter;

    }

    public void setTvNombre(String date) {
        tvNombre.setText(date);
    }

    public void setTvApellidos(String date) {
        tvApellidos.setText(date);
    }

    public void setTvDni(String date) {
        tvDni.setText(date);
    }

    public void setTvTelefono(String date) {
        tvTelefono.setText(date);
    }

    public void setTvEmail(String date) {
        tvEmail.setText(date);
    }
}
