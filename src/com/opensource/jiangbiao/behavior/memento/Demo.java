package com.opensource.jiangbiao.behavior.memento;

public class Demo {

    public static void main(String[] args){
        Originator originator =new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("第一次操作");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("第二次操作");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("第三次操作");
        careTaker.add(originator.saveStateToMemento());
        originator.getStateFromMemento(careTaker.repeal());
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.repeal());
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.repeal());
        System.out.println(originator.getState());
    }
}
