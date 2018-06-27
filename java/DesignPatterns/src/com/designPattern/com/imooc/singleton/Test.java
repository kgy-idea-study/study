package com.designPattern.com.imooc.singleton;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/25 14:27
 */
public class Test {
    public static void main(String[] args) {
        //饿汉模式
        Singleton s1=Singleton.getSingleton();
        Singleton s2=Singleton.getSingleton();
        if(s1==s2){
            System.out.println("s1和s2是同一个实例");
        }else{
            System.out.println("s1和s2不是同一个实例");
        }

        //懒汉模式
        Singleton2 s3=Singleton2.getInstance();
        Singleton2 s4=Singleton2.getInstance();
        if(s3==s4){
            System.out.println("s3和s4是同一个实例");
        }else{
            System.out.println("S3和s4不是同一个实例");
        }

    }
}
