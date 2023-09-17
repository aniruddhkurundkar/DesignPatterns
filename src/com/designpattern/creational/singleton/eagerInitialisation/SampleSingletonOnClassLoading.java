package com.designpattern.creational.singleton.eagerInitialisation;

/**
 * SampleSingleton class created by eager initialisation.
 * Object of class is created when it is loaded to the memory by JVM.
 * It is done by assigning the reference of an instance directly.
 * It can be used when program will always use instance of this class,
 * or the cost of creating the instance is not too large in terms of resources and time.
 *
 * 1.May lead to resource wastage. Because instance of class is created always, whether it is required or not.
 * 2.CPU time is also wasted in creation of instance if it is not required.
 * 3.Exception handling is not possible.
 */
public class SampleSingletonOnClassLoading {

    // private instance is initialised when loading the class.
    private static final SampleSingletonOnClassLoading instance = new SampleSingletonOnClassLoading();

    // private default constructor
    private SampleSingletonOnClassLoading(){

    }

    // Get Instance method which will return sample singleton instance object.
    public static SampleSingletonOnClassLoading getInstance(){
        return instance;
    }
}
