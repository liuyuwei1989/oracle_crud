package com.lyw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lyw.dao.IEmployeeDAO;
import com.lyw.entity.Employee;

public class EmployeeDAO extends HibernateDaoSupport implements IEmployeeDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> queryAll() {
		return super.getHibernateTemplate().find("from Employee");
	}

	@Override
	public void insert(Employee employee) {
		super.getHibernateTemplate().save(employee);
	}

	@Override
	public Employee findEmpById(Integer id) {
		return super.getHibernateTemplate().get(Employee.class,id);
	}

	@Override
	public void update(Employee employee) {
		super.getHibernateTemplate().update(employee);
	}

	@Override
	public void deleteById(Integer id) {
		super.getHibernateTemplate().delete(this.findEmpById(id));
	}

}
