package com.designpattern.creational.abstractfactory;

public abstract class AbstractFoodFactory{
    public abstract String getItemName();
    public abstract boolean isDelivered();
    public abstract int getQuantity();

    public abstract AbstractFoodFactory placeOrder(String itemName, int quantity);
}
