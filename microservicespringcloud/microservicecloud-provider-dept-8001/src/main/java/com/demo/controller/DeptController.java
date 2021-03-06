/**
 * @(#)DeptController.java 2019年11月15日 下午5:08:42
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Dept;
import com.demo.service.DeptService;

/**
 * <p>DeptController.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@RestController
public class DeptController{
	
  @Autowired
  private DeptService service;
  
  @RequestMapping(value="/dept/add",method=RequestMethod.POST)
  public boolean add(@RequestBody Dept dept){
   return service.add(dept);
  }
  
  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
  public Dept get(@PathVariable("id") Long id){
   return service.get(id);
  }
  
  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
  public List<Dept> list(){
   return service.list();
  }
  

}
 
