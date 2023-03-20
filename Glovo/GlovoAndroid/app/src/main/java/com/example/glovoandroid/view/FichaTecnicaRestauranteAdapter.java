package com.example.glovoandroid.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;

import java.util.ArrayList;

public class FichaTecnicaRestauranteAdapter extends RecyclerView.Adapter<FichaTecnicaRestauranteAdapter.ViewHolder>{

    private ArrayList<Restaurante> datosRestaurante;
    private Context context;

    public FichaTecnicaRestauranteAdapter(Context context){
        this.context = context;
        datosRestaurante = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ficha_descriptiva,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurante restaurante = datosRestaurante.get(position);
        holder.idNombre.setText(restaurante.getNombre());
        holder.idDescripcion.setText(restaurante.getDescripcion());
        holder.idPuntuacion.setText(restaurante.getPuntiacion());
        holder.idVentas.setText(restaurante.getVentas());


    }

    @Override
    public int getItemCount() {
        return datosRestaurante.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView idNombre;
        private TextView idDescripcion;
        private TextView idPuntuacion;
        private TextView idVentas;


        public ViewHolder(View itemView) {
            super(itemView);

            idNombre = itemView.findViewById(R.id.idNombre);
            idDescripcion= itemView.findViewById(R.id.idDescripcion);
            idPuntuacion = itemView.findViewById(R.id.idPuntuacion);
            idVentas = itemView.findViewById(R.id.idVentas);

        }
    }
}
