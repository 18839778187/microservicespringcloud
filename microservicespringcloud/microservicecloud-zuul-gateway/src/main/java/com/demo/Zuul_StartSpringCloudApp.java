/**
 * @(#)Zuul_StartSpringCloudApp.java 2019年11月21日 下午5:02:13
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_StartSpringCloudApp {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_StartSpringCloudApp.class, args);
	}
}
