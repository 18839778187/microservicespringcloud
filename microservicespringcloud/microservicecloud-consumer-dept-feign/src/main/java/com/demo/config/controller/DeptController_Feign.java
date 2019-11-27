/**
 * @(#)DeptController_Consumer.java 2019年11月15日 下午5:37:32
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Dept;
import com.demo.service.DeptClientService;

@RestController
public class DeptController_Feign {
	@Autowired
	private DeptClientService service = null;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}
}
