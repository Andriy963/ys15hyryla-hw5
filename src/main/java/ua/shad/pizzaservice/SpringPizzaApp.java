package ua.shad.pizzaservice;

import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.shad.pizzaservice.domain.Customer;
import ua.shad.pizzaservice.domain.Order;
import ua.shad.pizzaservice.repository.PizzaRepository;
import ua.shad.pizzaservice.service.OrderService;
import ua.shad.pizzaservice.service.PizzaService;

/**
 *
 * @author andrii
 */
public class SpringPizzaApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext repositoryContext
                = new ClassPathXmlApplicationContext("repositoryContext.xml");
        ConfigurableApplicationContext appContext
                = new ClassPathXmlApplicationContext(new String[]{"appContext.xml"}, repositoryContext);

        PizzaService pizzaService = appContext.getBean("pizzaService", PizzaService.class);
        OrderService orderService = appContext.getBean("orderService", OrderService.class);

        Customer customer = new Customer(1, "Andrii", "Sechenova 6");
        Order order = orderService.placeNewOrder(customer, 0, 1);

        orderService.addPizzaToOrder(order, 2);
        System.out.println("Price: " + order.getTotalPrice());
        List<Order> orders = orderService.getAllOrders();
        orders.stream().forEach(System.out::println);
    }
}
