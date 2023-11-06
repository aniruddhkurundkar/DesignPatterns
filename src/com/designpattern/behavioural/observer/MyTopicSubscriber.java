package com.designpattern.behavioural.observer;

public class MyTopicSubscriber implements Observer{

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name){
        this.name = name;
    }
    /**
     *
     */
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else{
            System.out.println(name+":: Consuming message::"+msg);
        }

    }

    /**
     * @param sub
     */
    @Override
    public void setSubject(Subject sub) {
            this.topic = sub;
    }
}
