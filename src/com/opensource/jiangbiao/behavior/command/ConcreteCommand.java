package com.opensource.jiangbiao.behavior.command;


//Command类的具体实现类
public class ConcreteCommand implements Command{

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver){
        this.receiver =receiver;
    }

    @Override
    public void execute(){
        receiver.action();
    }
}
