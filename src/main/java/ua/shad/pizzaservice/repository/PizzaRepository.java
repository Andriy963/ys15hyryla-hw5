package ua.shad.pizzaservice.repository;

import ua.shad.pizzaservice.domain.Pizza;

/**
 *
 * @author andrii
 */
public interface PizzaRepository {
    Pizza getPizzaById(Integer id);
}
