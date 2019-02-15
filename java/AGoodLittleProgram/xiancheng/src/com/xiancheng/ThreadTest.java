package com.xiancheng;

/**
 * @author kouguangyuan
 * @date 2019/2/13 9:44
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(testMyThread());
        System.out.println(testMyRun());
    }

    public static String testMyThread(){
        MyThread mythread = new MyThread();
        mythread.start();
        return "运行结束";
    }

    public static String testMyRun(){
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        return "运行结束!";
    }
}
