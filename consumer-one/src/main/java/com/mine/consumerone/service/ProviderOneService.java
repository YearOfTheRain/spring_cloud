package com.mine.consumerone.service;

import com.common.constants.ProviderServerConstant;
import com.mine.consumerone.service.fallback.ProviderOneFallbackFactory;
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
@FeignClient(contextId = "providerOneService",value = ProviderServerConstant.PROVIDER_ONE, fallbackFactory = ProviderOneFallbackFactory.class)
public interface ProviderOneService {

    /**
     * 获取信息
     * @param string
     * @return
     */
    @GetMapping("/echo/{string}")
    String echo(@PathVariable String string);

}
