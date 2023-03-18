package com.example.glovoandroid.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {
    @SerializedName("restaurante")
    private ArrayList<Restaurante> restaurante;



    @SerializedName("restauranteHamburguseria")
    private ArrayList<Restaurante> restauranteHamburguseria;



    @SerializedName("restaurantePizzeria")
    private ArrayList<Restaurante> restaurantePizzeria;


    /*@SerializedName("peliculasMasvotadas")
    private ArrayList<Restaurante> peliculasMasvotadas;*/

    @SerializedName("fichatecnica")
    private ArrayList<Restaurante> fichatecnica;

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }

    public ArrayList<Restaurante> getRestauranteHamburguseria() {
        return restauranteHamburguseria;
    }

    public void setRestauranteHamburguseria(ArrayList<Restaurante> restauranteHamburguseria) {
        this.restauranteHamburguseria = restauranteHamburguseria;
    }

    public ArrayList<Restaurante> getRestaurantePizzeria() {
        return restaurantePizzeria;
    }

    public void setRestaurantePizzeria(ArrayList<Restaurante> restaurantePizzeria) {
        this.restaurantePizzeria = restaurantePizzeria;
    }

    public ArrayList<Restaurante> getFichatecnica() {
        return fichatecnica;
    }

    public void setFichatecnica(ArrayList<Restaurante> fichatecnica) {
        this.fichatecnica = fichatecnica;
    }
}
