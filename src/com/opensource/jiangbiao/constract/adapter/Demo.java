package com.opensource.jiangbiao.constract.adapter;

public class Demo {

    public static void main(String[] args){
        Computer computer=new Computer();
        //Socket threePin =new ThreePin();
        //computer.setSocket(threePin);
        //computer.start();

        Adapter adapter=new Adapter();
         computer.setSocket(adapter);
        computer.start();


    }
}
