package com.patient.model;

import java.util.Date;

public class PatientModel {
	
	String name, regNo, gender, mobile, email;
	int age;
	Date regdate;
	
	
	
	public PatientModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientModel(String name, String regNo, String gender, String mobile, String email, int age, Date regdate) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
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



	public String getRegNo() {
		return regNo;
	}



	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
