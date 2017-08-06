package com.lyw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lyw.dao.IDepartDAO;
import com.lyw.entity.Depart;

public class DepartDAO extends HibernateDaoSupport implements IDepartDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Depart> queryAll() {
		return super.getHibernateTemplate().find("from Depart");
	}

	@Override
	public Depart queryById(Integer id) {
		return (Depart)this.getHibernateTemplate().get(Depart.class, id);
	}
	
}
