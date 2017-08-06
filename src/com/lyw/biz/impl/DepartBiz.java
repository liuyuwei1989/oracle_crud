package com.lyw.biz.impl;

import java.util.List;

import com.lyw.biz.IDepartBiz;
import com.lyw.dao.IDepartDAO;
import com.lyw.entity.Depart;
import com.lyw.entity.Employee;

public class DepartBiz implements IDepartBiz {

	private IDepartDAO departDAO;

	public void setDepartDAO(IDepartDAO departDAO) {
		this.departDAO = departDAO;
	}

	@Override
	public List<Depart> queryAll() {
		return this.departDAO.queryAll();
	}

	@Override
	public Depart queryById(Integer id) {
		return this.departDAO.queryById(id);
	}
}
