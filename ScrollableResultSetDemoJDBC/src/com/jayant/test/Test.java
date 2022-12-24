package com.jayant.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try (
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP1");
				){
			resultSet.last();
//			System.out.println(resultSet.getInt("ENO"));
//			resultSet.first();
//			resultSet.beforeFirst();
//			resultSet.next();
//			System.out.println(resultSet.getInt("ENO"));
//			resultSet.first();
//			resultSet.absolute(2);
//			System.out.println(resultSet.getInt("ENO"));
//			resultSet.last();
//			resultSet.absolute(-1);
//			System.out.println(resultSet.getInt("ENO"));
//			resultSet.first();
//			resultSet.relative(2);
//			System.out.println(resultSet.getInt("ENO"));
//			resultSet.last();
			resultSet.relative(-2);
			System.out.println(resultSet.getInt("ENO"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
