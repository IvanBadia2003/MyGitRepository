/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import DAO.DAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

/**
 *
 * @author S1-PC52
 */
public class Restaurante{

    private int Id_restaurante;
    private String Nombre;
    private String Descripcion;
    private int Puntiacion;
    private int Ventas;
    private String Imagen;
    private String genero;

    public Restaurante() {
    }

    public int getId_restaurante() {
        return Id_restaurante;
    }

    public void setId_restaurante(int Id_restaurante) {
        this.Id_restaurante = Id_restaurante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPuntiacion() {
        return Puntiacion;
    }

    public void setPuntiacion(int Puntiacion) {
        this.Puntiacion = Puntiacion;
    }

    public int getVentas() {
        return Ventas;
    }

    public void setVentas(int Ventas) {
        this.Ventas = Ventas;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public static String toArrayJSon(ArrayList<Restaurante> restaurante) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        String resp = gson.toJson(restaurante);

        return resp;
    }    
  
}
