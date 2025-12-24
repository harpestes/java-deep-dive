package org.example;

import org.example.model.Order;
import org.example.service.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L, "Andrew", 350.7, LocalDateTime.of(2025, 12, 24, 12, 0)));
        orders.add(new Order(2L, "Selen", 1300.2, LocalDateTime.of(2025, 11, 20, 12, 0)));
        orders.add(new Order(3L, "Valeriia", 320.5, LocalDateTime.of(2025, 11, 21, 11, 20)));
        orders.add(new Order(4L, "Jack", 3250.0, LocalDateTime.of(2025, 12, 24, 10, 10)));
        orders.add(new Order(5L, "Bruce", 500.5, LocalDateTime.of(2025, 12, 23, 9, 0)));
        orders.add(new Order(6L, "John", 150.6, LocalDateTime.of(2025, 12, 23, 12, 0)));

        System.out.println("Original order: " + orders);
        System.out.println("Sorted by date: " + orderService.sortOrders(orders, Order::compareTo));
        System.out.println("Sorted by price: " + orderService.sortOrdersByPrice(orders));
        System.out.println("Sorted by customer name: " + orderService.sortOrdersByCustomerName(orders));
    }
}
