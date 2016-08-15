package ua.shad.pizzaservice.service;

import java.util.List;
import ua.shad.pizzaservice.domain.Order;
import ua.shad.pizzaservice.domain.Customer;

/**
 *
 * @author andrii
 */
public interface OrderService {

    List<Order> getAllOrders();
    
    Order placeNewOrder(Customer customer, Integer... pizzasID);
    
    Order addPizzaToOrder(Order order, Integer pizzaId);
    
    Order removePizzaFromOrder(Order order, Integer pizzaId);
    
}
