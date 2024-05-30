package com.politecnicomalaga.appalquileres.Control;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Model.Cliente;
import com.politecnicomalaga.appalquileres.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClienteAdapter extends RecyclerView.Adapter<ClienteViewHolder> {


    private List<Cliente> clientesList;
    private LayoutInflater mInflater;

    private List<Cliente> clientesFiltrados;

    public ClienteAdapter(Context context, HashMap<String, Cliente> hashMap) {
        mInflater = LayoutInflater.from(context);
        clientesList = new ArrayList<>(hashMap.values());
        clientesFiltrados = new ArrayList<>(clientesList);
    }

    @NonNull
    @Override
    public ClienteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.cliente_list, parent, false);
        return new ClienteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ClienteViewHolder holder, int position) {
        Cliente cliente = clientesList.get(position);

        holder.setTvNombre(cliente.getNombre());
        holder.setTvApellidos(cliente.getApellidos());
        holder.setTvDni(cliente.getDni());
        holder.setTvTelefono(cliente.getTelefono());
        holder.setTvEmail(cliente.getEmail());
    }

    @Override
    public int getItemCount() {
        return clientesList.size();
    }

    public void updateData(HashMap<String, Cliente> hashMap) {
        clientesList = new ArrayList<>(hashMap.values());
        clientesFiltrados = new ArrayList<>(clientesList);
    }

    public void filtrarPorApellido(String filtro) {
        clientesFiltrados.clear();
        if (filtro.isEmpty()) {
            clientesFiltrados.addAll(clientesList);
        } else {
            for (Cliente cliente : clientesList) {
                if (cliente.getApellidos().toLowerCase().contains(filtro)) {
                    clientesFiltrados.add(cliente);
                }
            }
        }
        notifyDataSetChanged();
    }
}
