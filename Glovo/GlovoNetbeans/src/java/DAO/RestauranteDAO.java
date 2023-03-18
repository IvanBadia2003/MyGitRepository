/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Restaurante;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.FactoriaConexiones;
import model.Motor;

/**
 *
 * @author S1-PC52
 */
public class RestauranteDAO implements DAO<Restaurante, Integer> {
    
    private static final String SQL_SELECT_RESTAURANTE = "SELECT DISTINCT * FROM restaurante";
    private static final String SQL_SELECT_GENERO = "SELECT DISTINCT *,genero.nombre FROM restaurante INNER JOIN genero_restaurante ON restaurante.id_Restaurante = genero_restaurante.restaurante INNER JOIN genero ON genero_restaurante.Genero = genero.id_Genero WHERE  genero_restaurante.Genero = ";
    private static final String SQL_Peli_Votada = "SELECT * FROM `peliculas` ORDER BY valoracion DESC LIMIT 10";
    private static final String SQL_Ficha_Tecnica = "SELECT DISTINCT *,genero.nombre FROM restaurante INNER JOIN genero_restaurante ON restaurante.id_restaurante = genero_restaurante.restaurante INNER JOIN genero ON genero_restaurante.Genero = genero.id_Genero";
    private Motor motor = FactoriaConexiones.getInstance(1);

    @Override
    public void visualizar(Restaurante bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Restaurante> findAll(Restaurante bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_SELECT_RESTAURANTE + sql_filtro;
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
              System.out.println(resultset);
            // TRANSFORMADOR
            if(resultset!=null){
                    lstRestaurantes = new ArrayList();
                    while(resultset.next()){// 300, Braveheart
                        Restaurante restaurante = new Restaurante();
                        restaurante.setId_restaurante(resultset.getInt(1));
                        restaurante.setNombre(resultset.getString(2));
                        restaurante.setDescripcion(resultset.getString(3));;
                        restaurante.setPuntiacion(resultset.getInt(4));
                        restaurante.setVentas(resultset.getInt(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);

                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }

    @Override
    public void find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean getFilmsBySala(){
        return true;
    }
    
    public ArrayList<Restaurante> getFichaTecnica(Restaurante bean){
      String sql_filtro = "";
        String sql_final = "";
         ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_Ficha_Tecnica + sql_filtro;
            // SELECT * FROM PELICULA WHERE 1=! AND NOMBRE='300' AND SINOPOSIS etc!!!
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
             
            // TRANSFORMADOR
            if(resultset!=null){
                    lstRestaurantes = new ArrayList();

                    while(resultset.next()){// 300, Braveheart
                        Restaurante restaurante = new Restaurante();
                        restaurante.setId_restaurante(resultset.getInt(1));
                        restaurante.setNombre(resultset.getString(2));
                        restaurante.setDescripcion(resultset.getString(3));;
                        restaurante.setPuntiacion(resultset.getInt(4));
                        restaurante.setVentas(resultset.getInt(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);

                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }
    
    public ArrayList<Restaurante> getGeneroHamburgueseria(Restaurante bean){
      String sql_filtro = "2";
        String sql_final = "";
         ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_SELECT_GENERO + sql_filtro;
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
             
            // TRANSFORMADOR
            if(resultset!=null){
                    lstRestaurantes = new ArrayList();

                    while(resultset.next()){// 300, Braveheart
                        Restaurante restaurante = new Restaurante();
                        restaurante.setId_restaurante(resultset.getInt(1));
                        restaurante.setNombre(resultset.getString(2));
                        restaurante.setDescripcion(resultset.getString(3));;
                        restaurante.setPuntiacion(resultset.getInt(4));
                        restaurante.setVentas(resultset.getInt(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);
                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }
    public ArrayList<Restaurante> getGeneroPizzeria(Restaurante bean){
      String sql_filtro = "1";
        String sql_final = "";
         ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_SELECT_GENERO + sql_filtro;
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
             
            // TRANSFORMADOR
            if(resultset!=null){
                    lstRestaurantes = new ArrayList();

                    while(resultset.next()){// 300, Braveheart
                      Restaurante restaurante = new Restaurante();
                        restaurante.setId_restaurante(resultset.getInt(1));
                        restaurante.setNombre(resultset.getString(2));
                        restaurante.setDescripcion(resultset.getString(3));;
                        restaurante.setPuntiacion(resultset.getInt(4));
                        restaurante.setVentas(resultset.getInt(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);
                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }
    
    /*
    public ArrayList<Peliculas> pelisMasvotadas(Peliculas bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Peliculas> lstPeliculas = null;
          try {
            this.motor.connect();
            sql_final = SQL_Peli_Votada + sql_filtro;
            // SELECT * FROM PELICULA WHERE 1=! AND NOMBRE='300' AND SINOPOSIS etc!!!
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
              System.out.println(resultset);
            // TRANSFORMADOR
            if(resultset!=null){
                    lstPeliculas = new ArrayList();
                    while(resultset.next()){// 300, Braveheart
                        Peliculas pelicula = new Peliculas();
                        pelicula.setId_Pelicula(resultset.getInt(1));
                        pelicula.setNombre(resultset.getString(2));
                        pelicula.setDuracion(resultset.getInt(3));
                        pelicula.setClasificacion(resultset.getString(4));
                        pelicula.setDirector(resultset.getString(5));
                        pelicula.setInterpretes(resultset.getString(6));
                        pelicula.setTrailer(resultset.getString(7));
                        pelicula.setMusica(resultset.getString(8));
                        pelicula.setAno(resultset.getInt((9)));
                        pelicula.setDistribuidora(resultset.getString(10));
                        pelicula.setComentarios(resultset.getString(11));
                        pelicula.setPresupuesto(resultset.getInt(12));
                        pelicula.setImagen(resultset.getString(13));
                        pelicula.setValoracion(resultset.getInt(14));
                        pelicula.setSinopsis(resultset.getString(15));
                        pelicula.setPais(resultset.getString(16));
                        lstPeliculas.add(pelicula);

                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstPeliculas;
    }*/

}
