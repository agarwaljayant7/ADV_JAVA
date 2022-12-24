package com.jayant.app17.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try(
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement statement = connection.createStatement();
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(System.in));
				
				){
			System.out.println("Enter query  [Employee Related Query] : ");
			String query = bufferedReader.readLine();
			
			boolean flag = statement.execute(query);
			if(flag == true) {
				ResultSet resultSet = statement.getResultSet();
				System.out.println("ENO\tENAME\tESAL\tEADDR");
				System.out.println("-----------------------------");
				while(resultSet.next()) {
					System.out.println(resultSet.getInt("ENO")+"\t");
					System.out.println(resultSet.getString("ENAME")+"\t");
					System.out.println(resultSet.getFloat("ESAL")+"\t");
					System.out.println(resultSet.getString("EADDR")+"\t");
					
				}
			}else {
				int rowCount = statement.getUpdateCount();
				System.out.println("Row Count : " + rowCount);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
