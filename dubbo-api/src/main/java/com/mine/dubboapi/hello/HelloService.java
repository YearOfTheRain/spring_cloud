package com.mine.dubboapi.hello;

/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 测试服务
 * @date 2020-07-29 10:28
 */
public interface HelloService {

    /**
     * 打招呼的方法
     * @param name 姓名
     * @return
     */
    String sayHello(String name);
}
