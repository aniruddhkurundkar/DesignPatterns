package com.designpattern.creational.singleton.lazyInitialisation.threadSafe.doublecheck;


/**
 * We overcome the overhead problem of synchronized code.
 * In this method, getInstance is not synchronized but the block which creates instance
 * is synchronized so that minimum number of threads have to wait and that’s only for first time.
 * Performance overhead gets reduced because of synchronized keyword.
 * First time, it can affect performance.
 */
public class SampleSingletonWithThreadSafeDoubleCheck {

    private static SampleSingletonWithThreadSafeDoubleCheck instance;

    private SampleSingletonWithThreadSafeDoubleCheck(){

    }

     public static SampleSingletonWithThreadSafeDoubleCheck getInstance(){
        if(instance == null){
            synchronized(SampleSingletonWithThreadSafeDoubleCheck.class){
                if(instance == null){
                    instance = new SampleSingletonWithThreadSafeDoubleCheck();
                }
            }
        }
        return instance;
    }
}
