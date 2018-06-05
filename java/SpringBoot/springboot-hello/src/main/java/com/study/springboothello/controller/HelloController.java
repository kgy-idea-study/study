package com.study.springboothello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 我们在Controller中使用 @RestController 注解，该注解是Spring 4.0引入的。
 * 查看源码可知其包含了 @Controller 和 @ResponseBody 注解。
 * 我们可以理解为 @Controller的增强版。专门为响应内容式的 Controller 而设计的，可以直接响应对象为JSON。
 * 而 @Controller 用来响应页面，spring-boot 支持多种模版引擎包括：
 * 1，FreeMarker
 * 2，Groovy
 * 3，Thymeleaf （Spring 官网使用这个）
 * 4，Velocity
 * 5，JSP （貌似Spring Boot官方不推荐，STS创建的项目会在src/main/resources 下有个templates 目录，
 * 这里就是让我们放模版文件的，然后并没有生成诸如 SpringMVC 中的webapp目录）
 * 不过本文还是选择大家都熟悉的JSP来举例，因为使用JSP与默认支持的模版需要特殊处理，所以拿来举例更好。
 *
 * 关于Controller 方法可以接收参数使用@RequestBody、@RequestParam、@ModelAttribute、
 * JSONObject、HttpEntity 等方式，皆与Spring的使用一样，这里不做赘述。
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
        }
        return list;
    }
}
