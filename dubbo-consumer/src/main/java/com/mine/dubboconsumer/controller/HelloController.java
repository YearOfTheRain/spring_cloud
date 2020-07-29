package com.mine.dubboconsumer.controller;

import com.mine.dubboapi.hello.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 打招呼
 * @date 2020-07-29 11:06
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }
}
