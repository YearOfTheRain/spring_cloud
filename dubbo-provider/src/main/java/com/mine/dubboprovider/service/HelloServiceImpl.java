package com.mine.dubboprovider.service;

import com.mine.dubboapi.hello.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 实现类
 * @date 2020-07-29 10:47
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好: " + name;
    }
}
