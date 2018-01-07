package com.opensource.jiangbiao.behavior.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public int execute(int left,int right){
        return strategy.Operation(left,right);
    }
}
