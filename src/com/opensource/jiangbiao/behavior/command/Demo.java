package com.opensource.jiangbiao.behavior.command;

public class Demo {

    public static void main(String[] args){
        Receiver receiver=new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
