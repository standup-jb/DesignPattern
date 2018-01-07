package com.opensource.jiangbiao.behavior.visitor;

public class Keyboard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
