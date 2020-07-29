package com.common.enums;

/**
 * @author year
 * @version v1.0
 * @program spring_cloud
 * @description 服务枚举
 * @date 2020-07-18 12:13
 */
public enum ProviderServerEnum {

    /*** 第一个服务*/
    PROVIDER_ONE("provider-one");

    /*** 服务名称*/
    private String serverName;

    ProviderServerEnum(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }


}
