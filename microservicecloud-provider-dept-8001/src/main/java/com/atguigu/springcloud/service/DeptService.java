package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author lml
 * @date 2020/01/09 11:26
 */
public interface DeptService {

	boolean addDept(Dept dept);

	Dept get(Long id);

	List<Dept> list();
}
