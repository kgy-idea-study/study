package com.study.springbootservlet;

import com.study.springbootservlet.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 上一篇我们对如何创建Controller 来响应JSON 以及如何显示数据到页面中，已经有了初步的了解。
 * Web开发使用 Controller 基本上可以完成大部分需求，但是我们还可能会用到 Servlet、Filter、Listener、Interceptor 等等。
 *
 * 当使用Spring-Boot时，嵌入式Servlet容器通过扫描注解的方式注册Servlet、Filter和Servlet规范的所有监听器（如HttpSessionListener监听器）。
 * Spring boot 的主 Servlet 为 DispatcherServlet，其默认的url-pattern为“/”。也许我们在应用中还需要定义更多的Servlet，该如何使用SpringBoot来完成呢？
 *
 * 在spring boot中添加自己的Servlet有两种方法，代码注册Servlet和注解自动注册（Filter和Listener也是如此）。
 * 一、代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。
 * 也可以通过实现 ServletContextInitializer 接口直接注册。
 *
 * 二、在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
 */
@SpringBootApplication
public class SpringbootServletApplication {

    /**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     *
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServletApplication.class, args);
    }

    /**
     * 修改DispatcherServlet默认配置
     *
     * @param dispatcherServlet
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
    @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;
    }
}
