package com.manga.store;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList; // Список пользователей

    // Конструктор
    public UserService() {
        this.userList = new ArrayList<>(); // Инициализация списка пользователей
    }

    // Метод для добавления пользователя
    public void addUser (User user) {
        userList.add(user);
        System.out.println("User  added: " + user);
    }

    // Метод для удаления пользователя по ID
    public boolean removeUser (int id) {
        for (User  user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                System.out.println("User  removed: " + user);
                return true; // Возвращает true, если пользователь был успешно удален
            }
        }
        System.out.println("User  with ID " + id + " not found.");
        return false; // Возвращает false, если пользователь не найден
    }

    // Метод для получения списка всех пользователей
    public List<User> getAllUsers() {
        return new ArrayList<>(userList); // Возвращает новый список пользователей
    }

    // Метод для поиска пользователя по ID
    public User findUserById(int id) {
        for (User  user : userList) {
            if (user.getId() == id) {
                return user; // Возвращает пользователя, если найден
            }
        }
        return null; // Возвращает null, если пользователь не найден
    }

    // Метод для поиска пользователя по имени
    public List<User> findUserByName(String name) {
        List<User> result = new ArrayList<>();
        for (User  user : userList) {
            if (user.getName().equalsIgnoreCase(name)) {
                result.add(user); // Добавляет пользователя в результат, если имя совпадает
            }
        }
        return result; // Возвращает список найденных пользователей
    }
}