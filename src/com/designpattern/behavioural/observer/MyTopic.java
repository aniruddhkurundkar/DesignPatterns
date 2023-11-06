package com.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;

    private boolean changed;

    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    /**
     * @param obj
     */
    @Override
    public void register(Observer obj) {

        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    /**
     * @param obj
     */
    @Override
    public void unRegister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;
        synchronized (MUTEX) {
            if (!changed)
                return;
            observerLocal = new ArrayList<>(this.observers);
            this.changed = false;
            for (Observer obj : observerLocal) {
                obj.update();
            }
        }
    }

    /**
     * @param obj
     */
    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
