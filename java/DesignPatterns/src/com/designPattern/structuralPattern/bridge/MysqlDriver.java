package com.designPattern.structuralPattern.bridge;

public class MysqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("connect mysql done!");
    }
}
