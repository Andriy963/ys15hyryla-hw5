package ua.shad.pizzaservice.service;

import java.util.List;
import ua.shad.pizzaservice.domain.Pizza;
import ua.shad.pizzaservice.domain.Pizza.PizzaType;

/**
 *
 * @author andrii
 */
public interface PizzaService {
    List<Pizza> getAllPizzas();
    
    List<Pizza> getPizzasByType(PizzaType type);
    
    Pizza getPizzaById(Integer id);
    
    List<Pizza> getPizzasSortedByPrice();
}
