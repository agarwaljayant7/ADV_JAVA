package app15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try(Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				Statement statement = connection.createStatement();
				
			)
		{
			boolean flag = statement.execute("SELECT * FROM EMP1");
			ResultSet resultSet = statement.getResultSet();
			System.out.println(flag);
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------");
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("ENO")+"\t");
				System.out.println(resultSet.getString("ENAME")+"\t");
				System.out.println(resultSet.getString("ESAL")+"\t");
				System.out.println(resultSet.getString("EADDR")+"\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
