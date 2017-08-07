package com.lyw.dao;

import java.util.List;

import com.lyw.entity.Depart;
import com.lyw.entity.Employee;

public interface IDepartDAO {

	List<Depart> queryAll();

	Depart queryById(Integer id);

	void insert(Depart depart);

	void deleteById(Integer id);

}
