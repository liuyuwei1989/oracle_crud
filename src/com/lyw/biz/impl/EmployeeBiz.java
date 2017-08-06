package com.lyw.biz.impl;

import java.util.List;

import com.lyw.biz.IEmployeeBiz;
import com.lyw.dao.IEmployeeDAO;
import com.lyw.entity.Employee;


public class EmployeeBiz implements IEmployeeBiz {
	@Override
	public List<Employee> queryAll() {
		return empDAO.queryAll();
	}
	@Override
	public void insert(Employee employee) {
		empDAO.insert(employee);
	}
	@Override
	public Employee findEmpById(Integer id) {
		return empDAO.findEmpById(id);
	}
	@Override
	public void update(Employee employee) {
		empDAO.update(employee);
		
	}
	@Override
	public void deleteById(Integer id) {
		empDAO.deleteById(id);
	}
	
	private IEmployeeDAO empDAO;

	public void setEmpDAO(IEmployeeDAO empDAO) {
		this.empDAO = empDAO;
	}




}
