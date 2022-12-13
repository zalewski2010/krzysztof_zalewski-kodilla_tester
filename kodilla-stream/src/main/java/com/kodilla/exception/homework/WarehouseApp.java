package com.kodilla.exception.homework;

public class WarehouseApp {


    public static void main(String[] args)


            throws Exception {


        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order/10/2022"));
        warehouse.addOrder(new Order("Order/11/2022"));
        warehouse.addOrder(new Order("Order/12/2022"));
        warehouse.addOrder(new Order("Order/13/2022"));
        warehouse.addOrder(new Order("Order/14/2022"));
        warehouse.addOrder(new Order("Order/15/2022"));




        try {



            warehouse.isOrderInUse("Order/11/2022");
            System.out.println( "order doesnt exist.");

        } catch (OrderDoesntExistException e) {



            System.out.println(warehouse.getOrder("Order/12/2022") + " Your order exist in database.");
        } finally {

            {
                System.out.println("Thank you for using Data Warehouse System");
            }
        }
    }
}









    /*private static List<Integer> filterGetOrder() {
        List<Integer> getOrder = WarehouseApp.getOrdersList()
                .stream()
                .filter(order -> order.getOrder().equals("10"))
                .filter(order -> order.getOrder().equals("9"))
                .map(Warehouse::addOrder)
                .collect(Collectors.toList());


        return getOrder;
    }


    }
*/



