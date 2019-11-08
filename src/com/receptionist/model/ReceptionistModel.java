package com.receptionist.model;

import java.util.Date;

public class ReceptionistModel {
	
	String name, staff_id, password;
	Date regdate;

	public ReceptionistModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceptionistModel(String name, String staff_id, String password, Date regdate) {
		super();
		this.name = name;
		this.staff_id = staff_id;
		this.password = password;
		this.regdate = regdate;
	}

	public String getName() {
		return name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
