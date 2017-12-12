package com.opensource.jiangbiao.create.prototype;

public class Prototype implements Cloneable{

    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}
