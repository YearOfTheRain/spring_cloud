package com.mine.consumerone.service.fallback;

import com.mine.consumerone.service.ProviderOneService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 第一个服务失败返回记录
 * @date 2020-07-18 14:09
 */
@Component
public class ProviderOneFallbackFactory implements FallbackFactory<ProviderOneService> {

    private Logger logger = LoggerFactory.getLogger(ProviderOneFallbackFactory.class);

    @Override
    public ProviderOneService create(Throwable cause) {
        logger.error("第一个服务调用失败：【{}】", cause.getMessage());
        return new ProviderOneService() {
            @Override
            public String echo(String string) {
                return "当前服务异常";
            }
        };
    }
}
