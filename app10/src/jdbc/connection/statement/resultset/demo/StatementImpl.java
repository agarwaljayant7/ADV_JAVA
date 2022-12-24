package jdbc.connection.statement.resultset.demo;

public class StatementImpl implements StatementInterface {

	@Override
	public Customer executeUpdate() {
		return new Customer(1, "AAA");
	}

	@Override
	public void m1() {
		System.out.println("m1-Statement-Interface");
	}
	
	@Override
	public ResultSetClass executeUpdate1() {
		return new ResultSetClass(1, "ENO");
	}
	
}
