package com.designPattern.com.imooc.proxy.fangfa4;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 17:43
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        //设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * o  目标类的实例
     * method   目标方法的反射对象
     * objects  方法的参数
     * proxy代理类的实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志开始...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(o, objects);
        System.out.println("日志结束...");
        return null;
    }
}
