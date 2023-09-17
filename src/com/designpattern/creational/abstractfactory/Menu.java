package com.designpattern.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.createOrder();
    }

    public boolean createOrder(){
        boolean orderCreated = false;
        ConsumerClass c = new ConsumerClass();
        List order = new ArrayList();
        order.add(c.placeOrder("Lazagne", 2, "italian"));
        order.add(c.placeOrder("ZunkaBhakar", 3, "indian"));
        order.add(c.placeOrder("Noodles", 1, "japanese"));
        System.out.println(order);
        return orderCreated;
    }
}
