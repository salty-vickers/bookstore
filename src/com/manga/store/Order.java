package com.manga.store;
import java.util.List;

public class Order {
    private int id; // Уникальный идентификатор заказа
    private int userId; // ID пользователя, сделавшего заказ
    private String details; // Подробности заказа

    // Конструктор
    public Order(int id, int userId, String details) {
        this.id = id;
        this.userId = userId;
        this.details = details;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getDetails() {
        return details;
    }

    // Переопределение метода toString для удобного отображения информации о заказе
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", details='" + details + '\'' +
                '}';
    }
}