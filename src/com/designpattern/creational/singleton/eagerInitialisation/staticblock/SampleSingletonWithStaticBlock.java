package com.designpattern.creational.singleton.eagerInitialisation.staticblock;


/**
 * Object is created on class loading so that we can have access on its creation,
 * like exception handling.
 * It can be used when there is a chance of exceptions in creating object with eager initialization.
 * 1.No need to implement getInstance() method. Instance can be accessed directly.
 * 2.Exceptions can be handled in static block.
 * 3.May lead to resource wastage. Because instance of class is created always, whether it is required or not.
 * 4.CPU time is also wasted in creation of instance if it is not required.
 *
 */
public class SampleSingletonWithStaticBlock {

    private static final SampleSingletonWithStaticBlock instance;

    private SampleSingletonWithStaticBlock(){

    }
    static{
        instance = new SampleSingletonWithStaticBlock();
    }
}
