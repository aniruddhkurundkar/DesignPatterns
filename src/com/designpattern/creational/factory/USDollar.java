package com.designpattern.creational.factory;

public class USDollar implements Currency{
    /**
     * @return
     */
    @Override
    public String getSymbol() {
        return "USD";
    }
}
