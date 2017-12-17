package com.opensource.jiangbiao.behavior.chainofresponsibility;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Debug logger:Logger" + message);
    }
}
