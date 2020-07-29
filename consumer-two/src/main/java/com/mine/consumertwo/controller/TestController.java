package com.mine.consumertwo.controller;

import com.mine.consumertwo.service.ProviderOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 测试控制器
 * @date 2020-07-18 11:55
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ProviderOneService providerOneService;

    @GetMapping("/test1/{string}")
    public Object test(@PathVariable String string){
        System.out.println("two --- 0000000");
        return providerOneService.echo(string);
    }
}
