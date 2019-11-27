/**
 * @(#)DeptClientServiceFallbackFactory.java 2019年11月21日 下午2:04:41
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.entity.Dept;

import feign.hystrix.FallbackFactory;

/**
 * <p>DeptClientServiceFallbackFactory.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月21日</p>
 * <p>@remark:</p>
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {

			@Override
			public Dept get(long id) {
				Dept dept = new Dept();
				dept.setDb_source("no this database in MySQL");
				dept.setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
				return dept;
			}

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				return false;
			}
			
		};
	}

}
