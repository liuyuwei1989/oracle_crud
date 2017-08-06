package com.lyw.action;

import java.util.List;

import com.lyw.biz.IDepartBiz;
import com.lyw.biz.IEmployeeBiz;
import com.lyw.entity.Depart;
import com.lyw.entity.Employee;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	/**
	 * 用于显示全部用户
	 * @return
	 */
	public String showAllEmp(){
		emps=employeeBiz.queryAll();
		return "showAll";
	}
	/**
	 * 用于调到添加用户的页面来显示部门
	 * @return
	 */
	public String addEmp(){
		departList=departBiz.queryAll();
		return "addEmp";
	}
	/**
	 * 用户添加用户
	 * @return
	 */
	public String insert(){
		employee.setDepart(departBiz.queryById(employee.getDepart().getId()));
		employeeBiz.insert(employee);
		return "insert";
	}
	/**
	 * 用于修改某一用户时，显示用户信息
	 * @return
	 */
	public String findEmp(){
		employee=employeeBiz.findEmpById(employee.getId());
		departList=departBiz.queryAll();
		return "findEmp";
	}
	/**
	 * 用于更新某一用户
	 * @return
	 */
	public String update(){
		employee.setDepart(departBiz.queryById(employee.getDepart().getId()));
		employeeBiz.update(employee);
		return "update";
	}
	/**
	 * 用于删除某一用户
	 * @return
	 */
	public String deleteEmp(){
		employeeBiz.deleteById(employee.getId());
		return "delete";
	}
	//Model
	private Employee employee = new Employee(); 
	
	//biz
	private IEmployeeBiz employeeBiz;
	private IDepartBiz departBiz;
	
	//data for query
	private List<Employee> emps;
	private List<Depart> departList;
	@Override
	public Employee getModel() {
		return employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setEmployeeBiz(IEmployeeBiz employeeBiz) {
		this.employeeBiz = employeeBiz;
	}

	public void setDepartBiz(IDepartBiz departBiz) {
		this.departBiz = departBiz;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public List<Depart> getDepartList() {
		return departList;
	}

	public void setDepartList(List<Depart> departList) {
		this.departList = departList;
	}

}
