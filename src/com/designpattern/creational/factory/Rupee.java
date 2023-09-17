package com.designpattern.creational.factory;

public class Rupee implements Currency{

    /**
     * @return
     */
    @Override
    public String getSymbol() {
        return "Rs";
    }
}
