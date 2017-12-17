package com.opensource.jiangbiao.behavior.chainofresponsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    protected void write(String message){
        System.out.println("Error Console:Logger"+message);
    }
}
