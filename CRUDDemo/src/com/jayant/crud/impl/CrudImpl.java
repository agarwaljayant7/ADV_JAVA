package com.jayant.crud.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.crud.Crud;
import com.jayant.crud.CrudX;

public class CrudImpl extends CrudX implements Crud{

	@Override
	public void create() {
		System.out.println("Create ");
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement = connection.createStatement();
				
		){
			int rowCount = statement.executeUpdate("CREATE TABLE EMP13(ENO NUMBER(11) PRIMARY KEY, ENAME VARCHAR2(20), ESAL FLOAT, EADDR VARCHAR2(100))");
			System.out.println("Table EMP13 Added successfully ");
			super.insertTable();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
	}
	

	
	@Override
	public void read() {
		System.out.println("read");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement = connection.createStatement();
			)
			{
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP13");
				
				while(resultSet.next()) {
					System.out.println("ENOS\tEname \t Esal \t Eaddr");
					System.out.println("----------------------------------");
					System.out.print(resultSet.getInt(1) + "\t");
					System.out.print(resultSet.getString(2) +  "\t ");
					System.out.print(resultSet.getFloat(3) + "\t ");
					System.out.print(resultSet.getString(4) + "\t ");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	@Override
	public void update() {
		System.out.println("update");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement = connection.createStatement();
		)
		{				//UPDATE 
				int rowCount = statement.executeUpdate("UPDATE EMP13 SET ENAME = 'SAGAR' WHERE ENO=1");
				System.out.println(rowCount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	@Override
	public void delete() {
		System.out.println("delete");
		
		try(
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement = connection.createStatement();
		){
				int rowCount = statement.executeUpdate("DELETE FROM EMP13 WHERE ENO = 1");
				System.out.println(rowCount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
