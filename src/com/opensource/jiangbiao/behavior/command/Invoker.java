package com.opensource.jiangbiao.behavior.command;

//请求者
public class Invoker {

    private Command command=null;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
