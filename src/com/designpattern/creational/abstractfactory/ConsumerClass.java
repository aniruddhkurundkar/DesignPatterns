package com.designpattern.creational.abstractfactory;

public class ConsumerClass {

    public AbstractFoodFactory placeOrder(String itemName,int quantity,String itemType) {
        AbstractFoodFactory a = null;
        if(itemType.equals("indian")) {
            a = new IndianFood();
        }else if(itemType.equals("japanese")) {
            a = new JapaneseFood();
        }else if(itemType.equals("italian")) {
            a = new ItalianFood();
        }
        if(a!=null) {
            return a.placeOrder(itemName, quantity);
        }else {
            return null;
        }
    }
}
