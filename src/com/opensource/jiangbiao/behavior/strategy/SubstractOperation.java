package com.opensource.jiangbiao.behavior.strategy;

public class SubstractOperation implements Strategy{

    @Override
    public int Operation(int left, int right) {
        return left-right;
    }
}
