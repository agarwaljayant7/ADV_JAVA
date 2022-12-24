package jdbc.connection.statement.resultset.demo;

public class DriverClass {

	public static void main(String[] args) {
			
//		StatementInterface statementInterface = new StatementImpl();  // an interface can hold it's implementation class's object reference variable
		
//		ConnectionInterface connection  = new StatementImpl();
		StatementInterface statement = new StatementImpl();
		ResultSetClass resultSet = statement.executeUpdate1();
		System.out.println(resultSet.getColDataType());
		System.out.println(resultSet.getColName());
		
	}

}
