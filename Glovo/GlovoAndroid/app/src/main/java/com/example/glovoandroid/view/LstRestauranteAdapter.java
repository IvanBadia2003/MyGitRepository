package com.example.glovoandroid.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.FichaDescriptiva;
import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LstRestauranteAdapter extends RecyclerView.Adapter<LstRestauranteAdapter.ViewHolder>  {

    private ArrayList<Restaurante> datosRestaurante;
    private Context context;


    public LstRestauranteAdapter(ArrayList<Restaurante> datosRestaurante, Context context) {
        this.datosRestaurante = datosRestaurante;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurante,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Restaurante restaurante = datosRestaurante.get(position);

        Picasso.get().load(restaurante.getImagen()).into(holder.idImgPelicula);
        holder.fichatecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(holder.fichatecnica.getContext(),
                        FichaDescriptiva.class
                );
                Bundle filtroBundle = new Bundle();
                filtroBundle.putInt("id_restaurante",restaurante.getId_restaurante());

                screenChanger.putExtras(filtroBundle);
                holder.fichatecnica.getContext().startActivity(screenChanger);
            }
        });

        holder.estrella1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella1.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });
        holder.estrella2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella2.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });
        holder.estrella3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella3.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });
        holder.estrella4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella4.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });
        holder.estrella4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella4.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });
        holder.estrella5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.estrella5.setImageResource(android.R.drawable.btn_star_big_on);
            }
        });

    }

    @Override
    public int getItemCount() {
        return datosRestaurante.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView idImgPelicula;
        private Button fichatecnica;
        private Button idCompra;
        private ImageView estrella1;
        private ImageView estrella2;
        private ImageView estrella3;
        private ImageView estrella4;
        private ImageView estrella5;

        public ViewHolder(View itemView) {
            super(itemView);

            idImgPelicula = (ImageView) itemView.findViewById(R.id.idImgRestaurante);
            fichatecnica = (Button) itemView.findViewById(R.id.idFichatecnica);
            idCompra = (Button) itemView.findViewById(R.id.idCompra);
            estrella1 = (ImageView) itemView.findViewById(R.id.estrella1);
            estrella2 = (ImageView) itemView.findViewById(R.id.estrella2);
            estrella3 = (ImageView) itemView.findViewById(R.id.estrella3);
            estrella4 = (ImageView) itemView.findViewById(R.id.estrella4);
            estrella5 = (ImageView) itemView.findViewById(R.id.estrella5);


        }
    }
}
