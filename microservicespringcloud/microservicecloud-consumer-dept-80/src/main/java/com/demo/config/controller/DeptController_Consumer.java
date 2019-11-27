/**
 * @(#)DeptController_Consumer.java 2019年11月15日 下午5:37:32
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.entity.Dept;

/**
 * <p>DeptController_Consumer.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@RestController
public class DeptController_Consumer
{
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	 @Autowired
	 private DiscoveryClient client;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
         return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }
    
    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }
    
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }   
    
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery(){
      List<String> list = client.getServices();
      System.out.println("**********" + list);
   
      List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
      for (ServiceInstance element : srvList) {
       System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
           + element.getUri());
      }
      return this.client;
    }
}
