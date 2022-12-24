package com.jayant.jdbc.type4driver.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		Connection con = null;
		Statement st = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL" , "SYSTEM" , "orcl");
			
			st = con.createStatement();
			
			System.out.println("Please enter the table Name: ");
			String tableName = br.readLine();
			
			System.out.println("Enter the column name : ");
			String colName = br.readLine();
			
			System.out.println("Column type : ");
			String colType = br.readLine();
			
			System.out.println("Size : ");
			Integer size = Integer.parseInt(br.readLine());
			
			
//			while(true) {
//				System.out.println("One more column ? : ");
//				String choice = br.readLine();
//				if(choice.equalsIgnoreCase("yes")) {
//					continue;
//				}
//				else {
//					
//					break;
//				}
//			}
			
						
//			int executeUpdate = st.executeUpdate(sqlQuery);
			System.out.println("Table " + tableName + " created successfully");
			
		}
		catch(Exception e) {
			System.out.println("Table creation was not successful");
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				con.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
