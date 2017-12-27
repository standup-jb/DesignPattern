package com.opensource.jiangbiao.behavior.memento;

import java.util.Stack;

public class CareTaker {

    public Stack<Memento> mementos = new Stack<>();

    public void add(Memento memento){
        this.mementos.push(memento);
    }


    public Memento repeal(){
        return mementos.pop();
    }
}
