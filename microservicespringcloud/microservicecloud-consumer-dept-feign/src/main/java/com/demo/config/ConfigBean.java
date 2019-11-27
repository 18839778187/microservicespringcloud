/**
 * @(#)ConfigBean.java 2019年11月15日 下午5:34:10
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>ConfigBean.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@Configuration
public class ConfigBean
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }
}

