package com.example.glovoandroid.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {
    @SerializedName("restaurante")
    private ArrayList<Restaurante> restaurante;


    @SerializedName("menu")
    private ArrayList<Restaurante> menu;


    @SerializedName("restauranteHamburguseria")
    private ArrayList<Restaurante> restauranteHamburguseria;


    @SerializedName("restaurantePizzeria")
    private ArrayList<Restaurante> restaurantePizzeria;

    @SerializedName("restaurantePolloFrito")
    private ArrayList<Restaurante> restaurantePolloFrito;
    @SerializedName("restauranteSandwicheria")
    private ArrayList<Restaurante> restauranteSandwicheria;

    public ArrayList<Restaurante> getRestauranteSandwicheria() {
        return restauranteSandwicheria;
    }

    public void setRestauranteSandwicheria(ArrayList<Restaurante> restauranteSandwicheria) {
        this.restauranteSandwicheria = restauranteSandwicheria;
    }

    @SerializedName("restauranteMasVentas")
    private ArrayList<Restaurante> restauranteMasVentas;
    @SerializedName("restauranteMasPuntuacion")
    private ArrayList<Restaurante> restauranteMasPuntuacion;


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

    public ArrayList<Restaurante> getRestauranteMasVentas() {
        return restauranteMasVentas;
    }

    public void setRestauranteMasVentas(ArrayList<Restaurante> restauranteMasVentas) {
        this.restauranteMasVentas = restauranteMasVentas;
    }


    public ArrayList<Restaurante> getMenu() {
        return menu;
    }
    public void setMenu(ArrayList<Restaurante> menu) {
        this.menu = menu;
    }

    public ArrayList<Restaurante> getRestaurantePolloFrito() {
        return restaurantePolloFrito;
    }

    public void setRestaurantePolloFrito(ArrayList<Restaurante> restaurantePolloFrito) {
        this.restaurantePolloFrito = restaurantePolloFrito;
    }
    public ArrayList<Restaurante> getRestauranteMasPuntuacion() {
        return restauranteMasPuntuacion;
    }

    public void setRestauranteMasPuntuacion(ArrayList<Restaurante> restauranteMasPuntuacion) {
        this.restauranteMasPuntuacion = restauranteMasPuntuacion;
    }
}
