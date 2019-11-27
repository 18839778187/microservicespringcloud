/**
 * @(#)DeptConsumer80_App.java 2019年11月15日 下午5:42:36
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>DeptConsumer80_App.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.demo"})
@ComponentScan("com.demo")
public class DeptConsumer80_Feign_App{
  public static void main(String[] args)
  {
   SpringApplication.run(DeptConsumer80_Feign_App.class, args);
  }
}
 

