
package patron;

import patron.abstract_builder.PizzaBuilder;
import patron.concrete_builder.HawaiiPizzaBuilder;
import patron.concrete_builder.PicantePizzaBuilder;
import patron.director.Cocina;

public class PatronBuilder {

    
    public static void main(String[] args) {
        Cocina cocina = Cocina.getInstance();
        // PATRÓN FACTORÍA
        /*
        PizzaBuilder hawaianPizza = new HawaiiPizzaBuilder();
        PizzaBuilder picantePizza = new PicantePizzaBuilder();
        */
        PizzaBuilder hawaianPizza 
            = PIZZA_FACTORY.getInstance
                    (PIZZA_FACTORY.HAWAII_PIZZA);
        PizzaBuilder picantePizza 
            = PIZZA_FACTORY.getInstance
                    (PIZZA_FACTORY.PICANTE_PIZZA);
        picantePizza.buildRelleno(); 
        // VINCULACIÓN DINÁMICA
        
        cocina.setPizzaBuilder(hawaianPizza);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(picantePizza);
        cocina.construirPizza();
        
        
        
    }
    
}
