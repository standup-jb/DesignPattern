package com.opensource.jiangbiao.behavior.strategy;

public class MultiplyOperation implements Strategy{

    @Override
    public int Operation(int left, int right) {
        return left*right;
    }
}
