/**
 * @(#)Dept.java 2019年11月15日 下午3:18:44
 *
 * Copyright HeNan UiotSoft. All rights reserved.
 */
package com.demo.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Dept.java此类用于</p>
 * <p>@author:hmx</p>
 * <p>@date:2019年11月15日</p>
 * <p>@remark:</p>
 */
@NoArgsConstructor
@Data
public class Dept implements Serializable{

	  private Long  deptno;   //主键
	  private String  dname;   //部门名称
	  private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	  public Dept(String dname){
	   super();
	   this.dname = dname;
	 }
}
