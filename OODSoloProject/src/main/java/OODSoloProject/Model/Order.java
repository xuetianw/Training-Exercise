package OODSoloProject.Model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private int orderId;
    private Book bookOrdered;
    private User user;
    private LocalDateTime orderDateTime;

    public Order() {
    }

    public Order(int orderId, Book bookOrdered, User user, LocalDateTime orderDateTime) {
        this.orderId = orderId;
        this.bookOrdered = bookOrdered;
        this.user = user;
        this.orderDateTime = orderDateTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Book getBookOrdered() {
        return bookOrdered;
    }

    public void setBookOrdered(Book bookOrdered) {
        this.bookOrdered = bookOrdered;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", bookOrdered=" + bookOrdered +
                ", user=" + user +
                ", orderDateTime=" + orderDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(bookOrdered, order.bookOrdered)
                && Objects.equals(user, order.user) && Objects.equals(orderDateTime, order.orderDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, bookOrdered, user, orderDateTime);
    }
}
