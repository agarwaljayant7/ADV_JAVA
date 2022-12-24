package com.jayant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.dto.Student;
import com.jayant.factory.ConnectionFactory;

public class StudentDaoImpl implements StudentDao {

	String status = "";
	@Override
	public String register(Student student) {
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT WHERE SID='"+student.getSid()+"'");
			if(resultSet.next()) {
				status = "SUCCESS";
			}else {
				int rowCount = statement.executeUpdate("INSERT INTO STUDENT VALUES('"+student.getSid()+"','"+student.getSname()+"','"+student.getSaddr()+"')");
				if(rowCount == 1) {
					status = "SUCCESS";
				}else {
					status = "FAILURE";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
