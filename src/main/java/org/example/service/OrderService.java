package org.example.service;

import org.example.model.Order;

import java.util.Comparator;
import java.util.List;

public class OrderService {

    public List<Order> sortOrders(List<Order> orders, Comparator<Order> comparator) {
        return orders.stream().sorted(comparator).toList();
    }

    public List<Order> sortOrdersByPrice(List<Order> orders) {
        return orders.stream().sorted(Comparator.comparing(Order::getPrice)).toList();
    }

    public List<Order> sortOrdersByCustomerName(List<Order> orders) {
        return orders.stream().sorted(Comparator.comparing(Order::getCustomerName)).toList();
    }
}
