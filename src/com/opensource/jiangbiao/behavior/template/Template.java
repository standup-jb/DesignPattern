package com.opensource.jiangbiao.behavior.template;

public abstract class Template {

     abstract void weakUp();
     abstract void lunch();
     abstract void sleep();

    public final void holdDay(){
        weakUp();
        lunch();
        sleep();

    }
}
