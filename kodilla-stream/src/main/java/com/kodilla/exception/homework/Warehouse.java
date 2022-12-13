package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    private List<Order> orders=new ArrayList<>();

    List<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) {
        Order order = null;
        try {
            order = getOrders()
                    .stream()
                    .filter(orders -> orders.getNumber().equals(number))
                    .findAny().orElseThrow(() -> new Exception(number + " - This order number doesnt exist in warehouse.Search again!" ));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return order;
    }



    public String isOrderInUse(String number) throws OrderDoesntExistException {
        if (getOrder(number).equals(number))
            return getOrder(number).toString();
        throw new OrderDoesntExistException();
    }

    public List<Order> getOrders() {
        return orders;
    }

   @Override
    public String toString() {
        return super.toString();
    }
}
