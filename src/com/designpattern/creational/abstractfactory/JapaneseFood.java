package com.designpattern.creational.abstractfactory;

public class JapaneseFood extends AbstractFoodFactory{

    String itemName;
    boolean isDelivered;
    int quantity;

    public JapaneseFood(){

    }
    public JapaneseFood(String itemName,int quantity){
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
        return new JapaneseFood(itemName,quantity);
    }
}
