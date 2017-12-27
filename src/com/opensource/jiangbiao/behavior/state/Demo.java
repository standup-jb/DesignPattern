package com.opensource.jiangbiao.behavior.state;

public class Demo {

    public static void main(String[] args){
        Context context =new Context();
        context.setState(new LegalState());
        context.enchashment();
        context.setState(new OverdraftState());
        context.enchashment();
    }
}
