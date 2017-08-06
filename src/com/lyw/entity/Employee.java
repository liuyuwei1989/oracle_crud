package com.lyw.entity;

import java.util.Date;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer id;
	private Depart depart;
	private String sex;
	private Date birth;
	private String name;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Depart depart, String sex, Date birth, String name) {
		this.depart = depart;
		this.sex = sex;
		this.birth = birth;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Depart getDepart() {
		return this.depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}