package com.designpattern.behavioural.observer;

public interface Subject {

    // method to register or unregister observers
    public void register(Observer obj);
    public void unRegister(Observer obj);

    // method to get notify observers of change
    public void notifyObservers();

    //method to get update rom subject.
    public Object getUpdate(Observer obj);

}
