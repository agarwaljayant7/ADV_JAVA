package com.jayant.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				Statement statement = connection.createStatement();
//				int rowCount = statement.executeUpdate("CREATE TABLE EMP9(ENO NUMBER(10) PRIMARY KEY, ENAME VARCHAR2(50), ESAL FLOAT, EADDR VARCHAR2(40), EMOBILE NUMBER(10))");
//				int rowCount1 = statement.executeUpdate("CREATE TABLE CUST9(CNO NUMBER(10) PRIMARY KEY, CNAME VARCHAR2(50), CMAIL VARCHAR2(50), CADDR VARCHAR2(50))");
//				
//				int rowCount2 = statement.executeUpdate("CREATE TABLE REGISTRY4(RNO NUMBER(10) PRIMARY KEY, RNAME VARCHAR2(10), HAS_ENTERPRISE NUMBER(1), TAB_NAME VARCHAR2(10))");
				
//				int rowCount2 = statement.executeUpdate("INSERT INTO EMP1 VALUES(1,'JAYANT',5000,'BLR')");
//				
//				System.out.println("No of rows inserted rowCount : " + rowCount2);
//				int rowCount3 = statement.executeUpdate("UPDATE EMP1 SET ESAL = ESAL + 1000 WHERE ENO = 1");
//				int rowCount4 = statement.executeUpdate("DELETE FROM EMP1 WHERE ENO = 1");
//				System.out.println(rowCount4);
//				System.out.println(rowCount3);
				
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
