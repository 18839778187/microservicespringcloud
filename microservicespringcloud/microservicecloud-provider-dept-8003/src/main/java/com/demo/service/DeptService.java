/**
 * @(#)DeptService.java 2019年11月15日 下午5:02:15
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.service;

import java.util.List;

import com.demo.entity.Dept;

/**
 * <p>DeptService.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
public interface DeptService {
	  public boolean add(Dept dept);
	  public Dept get(Long id);
	  public List<Dept> list();
}
