package com.opensource.jiangbiao.constract.composite;



//XX 党
public abstract class CCP {

    String name;

    public CCP(String name){
        this.name = name;
    }

    public CCP(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(CCP ccp);
    protected abstract void remove(CCP ccp);
    protected abstract void display(int depth);
}
