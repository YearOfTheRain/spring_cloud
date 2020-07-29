package com.mine.consumertwo.service;

import com.common.constants.ProviderServerConstant;
import com.mine.consumertwo.service.fallback.ProviderOneFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 第一个服务消费接口
 * @date 2020-07-18 12:22
 */
@FeignClient(contextId = "providerTwoService",value = ProviderServerConstant.PROVIDER_TWO, fallbackFactory = ProviderOneFallbackFactory.class)
public interface ProviderOneService {

    /**
     * 获取信息
     * @param string
     * @return
     */
    @GetMapping("/echo/{string}")
    String echo(@PathVariable String string);

}
