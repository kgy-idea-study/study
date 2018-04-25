package com.topo;

public class T {
    public static void main(String[] args) {
        IrmsTopoShareServiceService factoy = new IrmsTopoShareServiceService();
        TimeService timeServicePort = factoy.getTimeServicePort();
        String str = timeServicePort.topoService("YXFB", "I_CUST_INTERNET", "", "100015696161615");
        System.out.println(str);
    }
}
