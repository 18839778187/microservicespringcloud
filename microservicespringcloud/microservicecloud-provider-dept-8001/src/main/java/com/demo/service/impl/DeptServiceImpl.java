/**
 * @(#)DeptServiceImpl.java 2019年11月15日 下午5:04:08
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DeptDao;
import com.demo.entity.Dept;
import com.demo.service.DeptService;

/**
 * <p>DeptServiceImpl.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@Service
public class DeptServiceImpl implements DeptService{

	  @Autowired
	  private DeptDao dao ;
	  @Override
	  public boolean add(Dept dept)
	  {
	   return dao.addDept(dept);
	  }
	  @Override
	  public Dept get(Long id)
	  {
	   return dao.findById(id);
	  }
	  @Override
	  public List<Dept> list()
	  {
	   return dao.findAll();
	  }
}
