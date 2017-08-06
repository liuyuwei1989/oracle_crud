package com.lyw.dao;

import java.util.List;

import com.lyw.entity.Employee;

public interface IEmployeeDAO {

	List<Employee> queryAll();

	void insert(Employee employee);

	Employee findEmpById(Integer id);

	void update(Employee employee);

	void deleteById(Integer id);

}
