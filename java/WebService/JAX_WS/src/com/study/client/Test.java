package com.study.client;

public class Test {
    public static void main(String[] args) {
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl wsImpl = factory.getWebServiceImplPort();
        String result = wsImpl.sayHello("测试");
        System.out.println("调用webservice返回的结果是：" + result);
    }
}
