package com.politecnicomalaga.appalquileres.Control;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Model.Vehiculo;
import com.politecnicomalaga.appalquileres.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehiculoAdapter extends RecyclerView.Adapter<VehiculoViewHolder> {

    private List<Vehiculo> vehiculoList;
    private LayoutInflater mInflater;
    private List<Vehiculo> vehiculosFiltrados;

    public VehiculoAdapter(Context context, HashMap<String, Vehiculo> hashMap) {
        mInflater = LayoutInflater.from(context);
        vehiculoList = new ArrayList<>(hashMap.values());
        vehiculosFiltrados = new ArrayList<>(vehiculoList);
    }

    @NonNull
    @Override
    public VehiculoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.vehiculo_list, parent, false);
        return new VehiculoViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull VehiculoViewHolder holder, int position) {
        Vehiculo vehiculo = vehiculosFiltrados.get(position);

        holder.setTvMatricula(vehiculo.getMatricula());
        holder.setTvModelo(vehiculo.getModelo());
        holder.setTvMarca(vehiculo.getMarca());
        holder.setTvTipoMotor(vehiculo.getTipoMotor().name());
    }

    @Override
    public int getItemCount() {
        return vehiculosFiltrados.size();
    }

    public void updateData(HashMap<String, Vehiculo> hashMap) {
        vehiculoList = new ArrayList<>(hashMap.values());
        vehiculosFiltrados = new ArrayList<>(vehiculoList);
    }

    public void filtrarPorMatricula(String filtro) {
        vehiculosFiltrados.clear();
        for (Vehiculo vehiculo : vehiculoList) {
            if (vehiculo.getMatricula().toLowerCase().contains(filtro.toLowerCase())){
                vehiculosFiltrados.add(vehiculo);
            }
        }
        notifyDataSetChanged();
    }
}
