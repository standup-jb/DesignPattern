package com.opensource.jiangbiao.behavior.observer;

public class ManObserver extends Observer{

    public ManObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String message) {
        if(message.equalsIgnoreCase("man")){
            System.out.println("我是男人，我接受到消息");
        }else {
            System.out.println("我是男人，我接到到消息，但是不做任何事情");
        }

    }
}
