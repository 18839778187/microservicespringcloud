/**
 * @(#)DeptDao.java 2019年11月15日 下午4:53:16
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.entity.Dept;


/**
 * <p>DeptDao.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@Mapper
public interface DeptDao{
  public boolean addDept(Dept dept);
 
  public Dept findById(Long id);
 
  public List<Dept> findAll();
}

