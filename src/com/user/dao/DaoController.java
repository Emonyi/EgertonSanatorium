package com.user.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.doctor.model.DoctorModel;
import com.labTech.model.LabTechModel;
import com.patient.model.PatientModel;
import com.receptionist.model.ReceptionistModel;
import com.sanatoriumApp.util.DatabaseDao;

public class DaoController {
	
	
public void addPatient(PatientModel patient) {
		
		
		try {
			
			String query = "insert into patient(name, age, regNo, gender, mobile, email, regdate) values(?,?,?,?,?,?,?)";
			
//			String query = "insert into patient(name, age, regNo, gender, mobile, email, regdate) "
//					+ "values('"+patient.getName()+"','"+patient.getAge()+"','"+patient.getRegNo()+"','"+patient.getGender()+"','"+patient.getMobile()+"','"+patient.getEmail()+"',CuRDATE()";
//			
			
			//Prepared statement
			
			DatabaseDao database=new DatabaseDao();
			
			PreparedStatement statement= database.getPreparedStatement(query);
			statement.setString(1, patient.getName());
			statement.setInt(2, patient.getAge());
			statement.setString(3, patient.getRegNo());
			statement.setString(4, patient.getGender());
			statement.setString(5, patient.getMobile());
			statement.setString(6, patient.getEmail());
			statement.setDate(7, new java.sql.Date(patient.getRegdate().getTime()));
			
			database.insertToDB(statement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void addDoctor(DoctorModel doctor) {
		
//		String query = "insert into doctor(name, staff_id, password, regdate) "
//				+ "values('"+doctor.getName()+"','"+doctor.getStaff_id()+"','"+doctor.getPassword()+"',CURDATE())";
		
		
		
		try {
			
			String query = "insert into doctor(name, staff_id, password, regdate) values(?,?,?,?)";
			
			DatabaseDao database = new DatabaseDao();
			
			PreparedStatement statement = database.getPreparedStatement(query);
			
			statement.setString(1, doctor.getName());
			statement.setString(2, doctor.getStaff_id());
			statement.setString(3, doctor.getPassword());
			statement.setDate(4, new java.sql.Date(doctor.getRegdate().getTime()));
			
			database.insertToDB(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}
	
	public void addReceptionist(ReceptionistModel receptionist) {
		
//		String query = "insert into receptionist(name, staff_id, password, regdate) "
//				+ "values('"+receptionist.getName()+"','"+receptionist.getStaff_id()+"','"+receptionist.getPassword()+"',CURDATE())";
		
		String query = "insert into receptionist(name, staff_id, password, regdate) "
				+ "values(?,?,?,?)";
		
		DatabaseDao database = new DatabaseDao();
		
		PreparedStatement statement = database.getPreparedStatement(query);
		
		try {
			statement.setString(1, receptionist.getName());
			statement.setString(2, receptionist.getStaff_id());
			statement.setString(3, receptionist.getPassword());
			statement.setDate(4, new java.sql.Date(receptionist.getRegdate().getTime()));
			
			database.insertToDB(statement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void addLabTech(LabTechModel lab) {
		
//		String query = "insert into lab_tech(name, staff_id, password, regdate) "
//				+ "values('"+lab.getName()+"','"+lab.getStaff_id()+"','"+lab.getPassword()+"',CURDATE())";
		
		String query = "insert into lab_tech(name, staff_id, password, regdate) "
				+ "values(?,?,?,CURDATE())";
		
		DatabaseDao database = new DatabaseDao();
		
		PreparedStatement statement = database.getPreparedStatement(query);
		
		
		try {
			statement.setString(1, lab.getName());
			statement.setString(2, lab.getStaff_id());
			statement.setString(3, lab.getPassword());
			statement.setDate(4, new java.sql.Date(lab.getRegdate().getTime()));
			
			database.insertToDB(statement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
