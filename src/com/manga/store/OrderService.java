package com.manga.store;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orderList; // Список заказов

    // Конструктор
    public OrderService() {
        this.orderList = new ArrayList<>(); // Инициализация списка заказов
    }

    // Метод для добавления заказа
    public void addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order added: " + order);
    }

    // Метод для удаления заказа по ID
    public boolean removeOrder(int id) {
        for (Order order : orderList) {
            if (order.getId() == id) {
                orderList.remove(order);
                System.out.println("Order removed: " + order);
                return true; // Возвращает true, если заказ был успешно удален
            }
        }
        System.out.println("Order with ID " + id + " not found.");
        return false; // Возвращает false, если заказ не найден
    }

    // Метод для получения списка всех заказов
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderList); // Возвращает новый список заказов
    }

    // Метод для поиска заказа по ID
    public Order findOrderById(int id) {
        for (Order order : orderList) {
            if (order.getId() == id) {
                return order; // Возвращает заказ, если найден
            }
        }
        return null; // Возвращает null, если заказ не найден
    }

    // Метод для поиска заказов по пользователю
    public List<Order> findOrdersByUserId(int userId) {
        List<Order> result = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getUserId() == userId) {
                result.add(order); // Добавляет заказ в результат, если ID пользователя совпадает
            }
        }
        return result; // Возвращает список найденных заказов
    }
}