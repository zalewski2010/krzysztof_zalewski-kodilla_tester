package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WarehouseTest {



    @Test
    public void isOrderInUse() throws OrderDoesntExistException  {
        // given
        Warehouse warehouse = new Warehouse();

        // when
       boolean isOrderInUse = Boolean.parseBoolean(warehouse.isOrderInUse("Order/11/2022"));
        // then
        assertTrue(isOrderInUse);
    }


    @Test
    public void testIsOrderInUse_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order/12/2022"));
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.isOrderInUse("Order/11/2022"));
    }
}