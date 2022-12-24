package com.jayant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.factories.ConnectionFactory;

public class EditorDaoImpl implements EditorDao {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	@Override
	public boolean executeUserQuery(String query) {
		boolean flag = false;
			
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			flag = statement.execute(query);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public Object getResultSet() {
		
		return null;
	}

	@Override
	public int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = statement.getUpdateCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

}
