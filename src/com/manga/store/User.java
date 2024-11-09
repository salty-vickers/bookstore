package com.manga.store;
public class User {
    private int id; // Уникальный идентификатор пользователя
    private String name; // Имя пользователя

    // Конструктор
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттер для id
    public int getId() {
        return id;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Переопределение метода toString для удобного отображения информации о пользователе
    @Override
    public String toString() {
        return "User  {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}