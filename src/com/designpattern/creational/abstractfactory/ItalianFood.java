package com.designpattern.creational.abstractfactory;

public class ItalianFood extends AbstractFoodFactory{

    String itemName;
    boolean isDelivered;
    int quantity;

    public ItalianFood(){

    }
    public ItalianFood(String itemName,int quantity){
        this.itemName = itemName;
        this.quantity = quantity;
    }
    @Override
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public AbstractFoodFactory placeOrder(String itemName, int quantity) {
        return new ItalianFood(itemName,quantity);
    }
}
