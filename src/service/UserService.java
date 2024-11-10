package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();
    }

    public void addUser (User user) {
        userList.add(user);
        System.out.println("User  added: " + user);
    }

    public boolean removeUser (int id) {
        for (User  user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                System.out.println("User  removed: " + user);
                return true;
            }
        }
        System.out.println("User  with ID " + id + " not found.");
        return false;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    public User findUserById(int id) {
        for (User  user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> findUserByName(String name) {
        List<User> result = new ArrayList<>();
        for (User  user : userList) {
            if (user.getName().equalsIgnoreCase(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public User getUserById(int id) {
        return null;
    }
}