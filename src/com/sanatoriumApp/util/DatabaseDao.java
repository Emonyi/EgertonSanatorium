package com.sanatoriumApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseDao {
	
public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanatorium", "root", "root");
			
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Database.getConnection-->"+e.getMessage());
		}
		return null;
		
	}
	
	
	
	public PreparedStatement getPreparedStatement(String sql) {
		PreparedStatement statement=null;
		try {
			statement = getConnection().prepareStatement(sql);
		} catch (SQLException e) {
		}
		
		return statement;
	}
	
	public void insertToDB(PreparedStatement statement) {		
		try {
			statement.executeUpdate();			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
	}
	
	public static void close(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
