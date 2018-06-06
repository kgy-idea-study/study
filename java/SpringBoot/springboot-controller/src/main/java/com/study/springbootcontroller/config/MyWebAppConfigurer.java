package com.study.springbootcontroller.config;

import com.study.springbootcontroller.interceptor.MyInterceptor1;
import com.study.springbootcontroller.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/5 17:44
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/static/img/");

        // 访问myres根目录下的fengjing.jpg 的URL为 http://localhost:8080/fengjing.jpg （/** 会覆盖系统默认的配置）
        // registry.addResourceHandler("/**").addResourceLocations("classpath:/myres/").addResourceLocations("classpath:/static/");

        // 可以直接使用addResourceLocations 指定磁盘绝对路径，同样可以配置多个位置，注意路径写法需要加上file:
        registry.addResourceHandler("/myimgs/**").addResourceLocations("file:G:\\图片\\电脑壁纸\\Win10锁屏壁纸第四波\\");
        super.addResourceHandlers(registry);
    }
}
