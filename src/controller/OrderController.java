package controller;

import model.Order;
import service.OrderService;

import java.util.List;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    public Order getOrderById(int id) {
        return orderService.getOrderById(id);
    }
}
