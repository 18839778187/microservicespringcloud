/**
 * @(#)EurekaServer7001_App.java 2019年11月19日 下午4:39:09
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>EurekaServer7001_App.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月19日</p>
 * <p>@remark:</p>
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_App.class, args);
	}
}
