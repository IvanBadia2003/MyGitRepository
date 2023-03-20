/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

/**
 *
 * @author S1-PC52
 */
public class Index {
    
    ArrayList<Restaurante> restaurante = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restauranteHamburguseria = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restaurantePizzeria = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restaurantePolloFrito = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restauranteSandwicheria = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restauranteMasVentas = new ArrayList<Restaurante>();
    ArrayList<Restaurante> restauranteMasPuntuacion = new ArrayList<Restaurante>();
    ArrayList<Restaurante> fichatecnica = new ArrayList<Restaurante>();
    
    public Index() {
    }

    public ArrayList<Restaurante> getFichatecnica() {
        return fichatecnica;
    }

    public void setFichatecnica(ArrayList<Restaurante> fichatecnica) {
        this.fichatecnica = fichatecnica;
    }

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

    public ArrayList<Restaurante> getRestauranteMasVentas() {
        return restauranteMasVentas;
    }

    public void setRestauranteMasVentas(ArrayList<Restaurante> restauranteMasVentas) {
        this.restauranteMasVentas = restauranteMasVentas;
    }

    public ArrayList<Restaurante> getRestauranteMasPuntuacion() {
        return restauranteMasPuntuacion;
    }

    public void setRestauranteMasPuntuacion(ArrayList<Restaurante> restauranteMasPuntuacion) {
        this.restauranteMasPuntuacion = restauranteMasPuntuacion;
    }

    public ArrayList<Restaurante> getRestaurantePolloFrito() {
        return restaurantePolloFrito;
    }

    public void setRestaurantePolloFrito(ArrayList<Restaurante> restaurantePolloFrito) {
        this.restaurantePolloFrito = restaurantePolloFrito;
    }

    public ArrayList<Restaurante> getRestauranteSandwicheria() {
        return restauranteSandwicheria;
    }

    public void setRestauranteSandwicheria(ArrayList<Restaurante> restauranteSandwicheria) {
        this.restauranteSandwicheria = restauranteSandwicheria;
    }


    
    
    

     public static String toArrayJSon(ArrayList<Index> index) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        String resp = gson.toJson(index);

        return resp;
    } 
    
}
