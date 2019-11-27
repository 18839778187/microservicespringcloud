/**
 * @(#)DeptClientService.java 2019年11月21日 上午10:21:01
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.Dept;

/**
 * <p>DeptClientService.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月21日</p>
 * <p>@remark:</p>
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
	  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	  public Dept get(@PathVariable("id") long id);
	 
	  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	  public List<Dept> list();
	 
	  @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	  public boolean add(Dept dept);
}
