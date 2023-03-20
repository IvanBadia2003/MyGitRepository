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
    private static final String SQL_SELECT_GENERO = "SELECT DISTINCT *,genero.nombre FROM restaurante INNER JOIN genero_restaurante ON restaurante.id_restaurante = genero_restaurante.id_restaurante INNER JOIN genero ON genero_restaurante.id_genero = genero.id_Genero WHERE genero.nombre = ";
    private static final String SQL_RESTAURANTES_VENTAS= "SELECT * FROM `restaurante` ORDER BY VENTAS DESC LIMIT 10;";
    private static final String SQL_RESTAURANTES_PUNTUACION= "SELECT * FROM `restaurante` ORDER BY puntuacion DESC LIMIT 10;";
    private static final String SQL_MENU= "SELECT DISTINCT r.nombre as nombre_restaurante, p.nombre as nombre_producto, p.precio FROM restaurante r INNER JOIN producto_restaurante pr ON r.id_restaurante = pr.id_restaurante INNER JOIN producto p ON p.id_producto = pr.id_producto ORDER BY r.nombre, p.nombre;";
    private static final String SQL_Ficha_Tecnica = "SELECT DISTINCT *,genero.nombre FROM restaurante INNER JOIN genero_restaurante ON restaurante.id_restaurante = genero_restaurante.id_restaurante INNER JOIN genero ON genero_restaurante.id_genero = genero.id_genero;";
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
    
        public ArrayList<Restaurante> findMenu(Restaurante bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_MENU + sql_filtro;
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
      String sql_filtro = "'Hamburgueseria'";
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
      String sql_filtro = "'Pizzeria'";
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
    
    public ArrayList<Restaurante> getGeneroPolloFrito(Restaurante bean){
      String sql_filtro = "'Pollo frito'";
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
    
//    public ArrayList<Restaurante> getGeneroSandwicheria(Restaurante bean){
//      String sql_filtro = "'Sandwicheria'";
//        String sql_final = "";
//         ArrayList<Restaurante> lstRestaurantes = null;
//          try {
//            this.motor.connect();
//            sql_final = SQL_SELECT_GENERO + sql_filtro;
//            ResultSet resultset = 
//                    this.motor.executeQuery(sql_final);
//             
//            // TRANSFORMADOR
//            if(resultset!=null){
//                    lstRestaurantes = new ArrayList();
//
//                    while(resultset.next()){// 300, Braveheart
//                      Restaurante restaurante = new Restaurante();
//                        restaurante.setId_restaurante(resultset.getInt(1));
//                        restaurante.setNombre(resultset.getString(2));
//                        restaurante.setDescripcion(resultset.getString(3));;
//                        restaurante.setPuntiacion(resultset.getInt(4));
//                        restaurante.setVentas(resultset.getInt(5));
//                        restaurante.setImagen(resultset.getString(6));
//                        lstRestaurantes.add(restaurante);
//                    }
//            }
//            this.motor.disconnect();
//        } catch (Exception ex) {
//                
//        }
//        return lstRestaurantes;
//    }
    
    
    public ArrayList<Restaurante> getRestauranteMasVentas(Restaurante bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_RESTAURANTES_VENTAS + sql_filtro;
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
                        restaurante.setVentas((int) resultset.getFloat(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);

                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }
    public ArrayList<Restaurante> getRestauranteMasPuntuacion(Restaurante bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
          try {
            this.motor.connect();
            sql_final = SQL_RESTAURANTES_PUNTUACION + sql_filtro;
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
                        restaurante.setVentas((int) resultset.getFloat(5));
                        restaurante.setImagen(resultset.getString(6));
                        lstRestaurantes.add(restaurante);

                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstRestaurantes;
    }

}
