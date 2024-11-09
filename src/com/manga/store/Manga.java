package com.manga.store;
public class Manga {
    private int id; // Уникальный идентификатор манги
    private String title; // Название манги
    private double price; // Цена манги

    // Конструктор
    public Manga(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Геттер для id
    public int getId() {
        return id;
    }

    // Геттер для названия
    public String getTitle() {
        return title;
    }

    // Геттер для цены
    public double getPrice() {
        return price; // Возвращает цену манги
    }

    // Переопределение метода toString для удобного отображения информации о манге
    @Override
    public String toString() {
        return "Manga {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}