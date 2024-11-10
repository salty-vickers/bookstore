package model;

public class Order {
    private int id;
    private int userId;
    private String details;

    public Order(int id, int userId, String details) {
        this.id = id;
        this.userId = userId;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", details='" + details + '\'' +
                '}';
    }
}