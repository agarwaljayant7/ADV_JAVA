package com.jayant.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

			
		try(		
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
				Statement statement = connection.createStatement();
				
			) {
		
			System.out.println("Bonus amount : ");
			
			int bonusAmount = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("Salary range : ");
			float salaryRange = Float.parseFloat(bufferedReader.readLine());
			
			
			int rowCount = statement.executeUpdate("UPDATE EMP1 SET ESAL =  ESAL - " + bonusAmount + " WHERE ESAL < " + salaryRange);
			System.out.println("Employeed updated  : " + rowCount);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try(
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection(null)
		){
			
		}
		catch(Exception e ) {
			
		}
	}

}
