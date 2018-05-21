package com.designPattern.structuralPattern.bridge;

public class Client {
    public static void main(String[] args) {

        DriverManager driverManager = new MyDriverManager();
        Driver driver1 = new MysqlDriver();
        driverManager.setDriver(driver1);
        driverManager.connect();

        Driver driver2 = new DB2Driver();
        driverManager.setDriver(driver2);
        driverManager.connect();

    }
}
