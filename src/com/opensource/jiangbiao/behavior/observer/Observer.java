package com.opensource.jiangbiao.behavior.observer;

public abstract class Observer {

    protected Subject subject;

    public abstract void update(String message);

}
