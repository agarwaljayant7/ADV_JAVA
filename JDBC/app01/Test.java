import java.sql.*;
class Test{
	public static void main(String[] args) throws Exception{
	 // Load and register the driver
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
	// Establish connection between java application and database
	Connection con = DriverManager.getConnection("jdbc:odbc:jayant","system","orcl");
	
	// Create Statement
	Statement st = con.createStatement();

	// Write and execute SQL query
	st.executeUpdate("CREATE TABLE EMP1(ENO NUMBER(5) PRIMARY KEY, ENAME VARCHAR2(10),ESAL FLOAT(5), EADDR VARCHAR2(10))");
	
	System.out.println("emp1 table created successfully");
	 
	// Close the resources
	st.close();
	con.close();
	}
}