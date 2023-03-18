/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;



import Clases.Index;
import Clases.Restaurante;
import DAO.RestauranteDAO;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S1-PC52
 */
@Path("api")
public class ApiRestaurante {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiRestaurante
     */
    public ApiRestaurante() {
    }

    /**
     * Retrieves representation of an instance of api.ApiRestaurante
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        
        
        
        
                 RestauranteDAO restauranteDAO = new RestauranteDAO();
                        ArrayList<Restaurante> lstRestaurantes = 
                                restauranteDAO.findAll(null);
                        
                        // Transformar de ArrayList a JSON
                     
                       
                       RestauranteDAO restauranteHamburgueseria = new RestauranteDAO();
                        ArrayList<Restaurante> lstRestauranteHamburgueseria = 
                                restauranteHamburgueseria.getGeneroHamburgueseria(null);
                        
                        // Transformar de ArrayList a JSON
                       
                       RestauranteDAO restaurantePizzeria = new RestauranteDAO();
                        ArrayList<Restaurante> lstRestaurantePizzeria = 
                                restaurantePizzeria.getGeneroPizzeria(null);
                        
                        /* RestauranteDAO peliculaMasvotadas = new RestauranteDAO();
                        ArrayList<Restaurante> lstPeliculasMasvotadas = 
                                peliculaMasvotadas.pelisMasvotadas(null);*/
                        
                        RestauranteDAO RestauranteFichatecnica = new RestauranteDAO();
                        ArrayList<Restaurante> lstRestauranteFicha = 
                                RestauranteFichatecnica.getFichaTecnica(null);
                        
                        
                       
              Index index = new Index();
              index.setRestaurante(lstRestaurantes);
              index.setRestauranteHamburguseria(lstRestauranteHamburgueseria);
              index.setRestaurantePizzeria(lstRestaurantePizzeria);
              /*index.setRestauranteMasvotadas(lstPeliculasMasvotadas);*/
              index.setFichatecnica(lstRestauranteFicha);
              
              ArrayList<Index> lstIndex = new ArrayList<Index>();
              lstIndex.add(index);
                       
                       
              return Index.toArrayJSon(lstIndex);
        
                      
    }

    /**
     * PUT method for updating or creating an instance of ApiRestaurante
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
