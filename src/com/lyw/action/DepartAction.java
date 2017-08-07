package com.lyw.action;

import java.util.List;

import com.lyw.biz.IDepartBiz;
import com.lyw.entity.Depart;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartAction extends ActionSupport implements ModelDriven<Depart> {
	
	private IDepartBiz departBiz;
	
	private List<Depart> departList;
	
	private Depart depart = new Depart();
	/**
	 * �����ڲ鿴���в��ż����Ź������ҳ������ʾ���в���
	 * @return
	 */
	public String showAll(){
		departList=departBiz.queryAll();
		return "showAll";
	}
	/**
	 * ���Ӳ���
	 * @return
	 */
	public String addDepart(){
		departBiz.insert(depart);
		return "add";
	}
	public String deleteDepart(){
		departBiz.deleteDepart(depart.getId());
		return "delete";
	}
	@Override
	public Depart getModel() {
		return depart;
	}
	public void setDepartBiz(IDepartBiz departBiz) {
		this.departBiz = departBiz;
	}
	public List<Depart> getDepartList() {
		return departList;
	}
	public void setDepartList(List<Depart> departList) {
		this.departList = departList;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

}
