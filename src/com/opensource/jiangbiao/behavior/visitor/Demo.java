package com.opensource.jiangbiao.behavior.visitor;

public class Demo {
    public static void main(String[] args){
        ComputerPart computer=new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
