import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott",
				"tiger");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP1");
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Jayant/Desktop/docs/emp1.html");
			) 
			
		{
			String data = "<html><body><table align='center' border='1'>";
			data = data + "<tr>";
			data = data + "<th>ENO</th><th>ENAME</th><th>ESAL</th><th>EADDR</th>";
			data = data + "</tr>";
			
			while(resultSet.next()) {
				data = data + "<tr>";
				data = data + "<td>" + resultSet.getInt("ENO") + "</td>";
				data = data + "<td>" + resultSet.getString("ENAME") + "</td>";
				data = data + "<td>" + resultSet.getFloat("ESAL") + "</td>";
				data = data + "<td>" + resultSet.getString("EADDR") + "</td>";
				data = data + "</tr>";
			}
			data = data + "</table></body></html>";
			
			byte[] byteArray = data.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("Data submitted to C:/Users/Jayant/Desktop/docs/emp1.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 * execute all the types of sql queries like select sql queries and non-select sql queries
 */
<html>
<body>
	<table align='center' border='1'>
	<table align='center' border='1'>
	<table align='center' border ='1'>
	<tr>
		<th>ENO</th>
		<th>ENAME></th>
		<th>ESAL</th>
		<th>EADDR</th>
	</tr>
	<tr>
		<th>111</th>
		<th>AAA></th>
		<th>5000</th>
		<th>HYD</th>
	</tr>	
	<tr>
		<th>222</th>
		<th>BBB></th>
		<th>6000</th>
		<th>HYD</th>
	</tr>	
	<tr>
		<th>333</th>
		<th>CCC></th>
		<th>7000</th>
		<th>HYD</th>
	</tr>	
</html>
*/