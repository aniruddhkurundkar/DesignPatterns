package com.designpattern.creational.singleton.lazyInitialisation.threadSafe.singlecheck;


/**
 * A thread safe singleton is created so that singleton property is maintained
 * even in multithreaded environment.
 * To make a singleton class thread safe, getInstance() method is made synchronized
 * so that multiple threads can’t access it simultaneously.
 *
 */
public class SampleSingletonWithThreadSafeSingleCheck {

    private static SampleSingletonWithThreadSafeSingleCheck instance;

    private SampleSingletonWithThreadSafeSingleCheck(){

    }

    synchronized public static SampleSingletonWithThreadSafeSingleCheck getInstance(){
        if(instance == null){
            instance = new SampleSingletonWithThreadSafeSingleCheck();
        }
        return instance;
    }

}
