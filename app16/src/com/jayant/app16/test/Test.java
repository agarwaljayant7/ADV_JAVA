package com.jayant.app16.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		try(
				Connection connection = DriverManager.getConnection(
						
						"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				Statement statement = connection.createStatement();
				){
			boolean flag = statement.execute("UPDATE EMP1 SET ESAL = ESAL + 500"
					+ " WHERE ESAL < 10000");
			System.out.println(flag);
			int rowCount = statement.getUpdateCount();
			System.out.println("EMployees updated : " + rowCount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
