package com.jayant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.factory.ConnectionFactory;

public class UserDaoImpl implements UserDao {

	@Override
	public String checkUser(String uname, String upwd) {
		String status = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS WHERE UNAME = '"+uname+"' AND UPWD = '"+upwd+"'");
			boolean flag = resultSet.next();
			if(flag == true) {
				status = "SUCCESS";
			}else {
				status = "FAILURE";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
