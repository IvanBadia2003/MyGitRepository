package com.example.glovoandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Restaurante {
    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("Descripcion")
    private String descripcion;

    @SerializedName("Puntiacion")
    private int puntiacion;

    @SerializedName("Ventas")
    private int ventas;
    @SerializedName("Imagen")
    private String imagen;
    @SerializedName("genero")
    private String genero;

    @SerializedName("Id_restaurante")
    private int id_restaurante;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntiacion() {
        return puntiacion;
    }

    public void setPuntiacion(int puntiacion) {
        this.puntiacion = puntiacion;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId_restaurante() {
        return id_restaurante;
    }

    public void setId_restaurante(int id_restaurante) {
        this.id_restaurante = id_restaurante;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", puntiacion=" + puntiacion +
                ", ventas=" + ventas +
                ", imagen='" + imagen + '\'' +
                ", genero='" + genero + '\'' +
                ", id_restaurante=" + id_restaurante +
                '}';
    }
}

