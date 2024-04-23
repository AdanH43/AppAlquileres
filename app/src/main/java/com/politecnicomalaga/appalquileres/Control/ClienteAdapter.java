package com.politecnicomalaga.appalquileres.Control;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appalquileres.Model.Cliente;
import com.politecnicomalaga.appalquileres.R;

import java.util.HashMap;

public class ClienteAdapter extends RecyclerView.Adapter<ClienteViewHolder> {

    private HashMap<String,Cliente> mHashMap;
    private LayoutInflater mInflater;

    public ClienteAdapter(Context context,
                          HashMap<String,Cliente> map) {
        mInflater = LayoutInflater.from(context);
        this.mHashMap = map;
    }


    @NonNull
    @Override
    public ClienteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.cliente_list,
                parent, false);
        return new ClienteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ClienteViewHolder holder, int position) {
        //TODO: fill data
        Cliente c = this.mHashMap.get(position);

        holder.setTvNombre(c.getNombre());
        holder.setTvApellidos(c.getApellidos());
        holder.setTvDni(c.getDni());
        holder.setTvTelefono(c.getTelefono());
        holder.setTvEmail(c.getEmail());
    }

    @Override
    public int getItemCount() {
        return mHashMap.size();
    }

}