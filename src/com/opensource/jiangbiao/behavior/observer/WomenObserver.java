package com.opensource.jiangbiao.behavior.observer;

public class WomenObserver extends Observer{

    public WomenObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String message) {
        if(message.equalsIgnoreCase("man")){
            System.out.println("我是女人，我接受到消息，但是不做任何事情");
        }else {
            System.out.println("我是女人，我接到到消息");
        }
    }
}
