package com.lyw.biz;

import java.util.List;

import com.lyw.entity.Depart;
import com.lyw.entity.Employee;

public interface IDepartBiz {

	List<Depart> queryAll();

	Depart queryById(Integer id);

}
