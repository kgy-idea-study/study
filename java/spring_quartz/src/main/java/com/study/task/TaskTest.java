package com.study.task;

import java.util.Date;

public class TaskTest {

    private static int counter = 0;

    public void execute()  {
        long ms = System.currentTimeMillis();
        System.out.print("测试Task");
        System.out.println("(" + counter++ + ")");
    }
}
