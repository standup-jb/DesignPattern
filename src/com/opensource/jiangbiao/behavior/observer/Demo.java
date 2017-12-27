package com.opensource.jiangbiao.behavior.observer;

public class Demo {
    public static void main(String[] args){
        Subject subject =new Subject();
        ManObserver manObserver =new ManObserver(subject);
        subject.attach(manObserver);
        WomenObserver womenObserver=new WomenObserver(subject);
        subject.attach(womenObserver);
        subject.notifyAllObservers("man");
        System.out.println("---------");
        subject.notifyAllObservers("woman");
    }
}
