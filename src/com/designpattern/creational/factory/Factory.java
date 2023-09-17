package com.designpattern.creational.factory;

/**
 * Factory Design pattern is based on Encapsulation object-oriented concept.
 * Factory method is used to create different object from factory often referred
 * as item, and it encapsulates the creation code.
 *
 * Best Example of Factory method design pattern is valueOf() method which is
 * there in String and wrapper classes like Integer and Boolean and used for type conversion
 * i.e. from converting String to Integer or String to double in java.
 *
 * Whenever we create an object using new() we violate the principle of programming for interface
 * rather than implementation which eventually results in inflexible code and is difficult to
 * change in maintenance. By using the Factory design pattern in Java we get rid of this problem.
 *
 * The factory methods are typically implemented as virtual methods, so this pattern is also
 * referred to as the “Virtual Constructor”. These methods create the objects of the products
 * or target classes.
 *
 */
public class Factory {
    public static void main(String[] args){
        String country = args[0];
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}
