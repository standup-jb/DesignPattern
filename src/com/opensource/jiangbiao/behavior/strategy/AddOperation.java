package com.opensource.jiangbiao.behavior.strategy;

public class AddOperation implements Strategy{

    @Override
    public int Operation(int left, int right) {
        return left+right;
    }
}
