/**
 * @(#)MySelfRule.java 2019年11月20日 下午5:49:11
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;


@Configuration
public class MySelfRule{
	 @Bean
	 public IRule myRule(){
//		 return new RandomRule();//Ribbon默认是轮询，我自定义为随机
		 return new RandomRule_ZY();//自定义为每个机器被访问5次
	}
}
