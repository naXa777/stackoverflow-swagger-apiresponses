package by.naxa.stackoverfow.swaggerapiresponses.web;

import by.naxa.stackoverfow.swaggerapiresponses.web.dto.Order;
import by.naxa.stackoverfow.swaggerapiresponses.web.dto.User;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@DefaultApiResponses
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @GetMapping("/{id:\\d+}")
    public Order getOrder(@PathVariable Integer id) {
        if (id > 0)
            return new Order(id);
        else
            throw new ResourceNotFoundException();
    }

    @GetMapping
    public List<Order> listOrders() {
        return Arrays.asList(new Order(1), new Order(2));
    }

}
