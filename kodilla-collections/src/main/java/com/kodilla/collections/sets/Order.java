package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Order(String orderNumber, String productName, double quantity) { // konstruktor alt+insert
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;
    }
    public String getOrderNumber() { // gettery alt+insert
        return orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Double.compare(order.getQuantity(), getQuantity()) == 0 && getOrderNumber().equals(order.getOrderNumber()) && getProductName().equals(order.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber(), getProductName(), getQuantity());
    }

    @Override
    public String toString() {  // metoda to string, aby poprawnie wyświetliły się obiekty kolekcji
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
