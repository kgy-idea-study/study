package com.designPattern.structuralPattern.bridge;

public class DB2Driver implements Driver {
    @Override
    public void connect() {
        System.out.println("connect db2 done!");
    }
}
