package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author kouguangyuan
 * @date 2018/7/12 14:03
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.aop.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Slience cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Slience cell phones around");
            System.out.println("Taking seats around");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP around");
        }catch (Throwable e){
            System.out.println("demanding a refund around");
        }
    }
}
