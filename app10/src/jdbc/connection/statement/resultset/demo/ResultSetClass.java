package jdbc.connection.statement.resultset.demo;

public class ResultSetClass{
	
	int colName;
	String colDataType;
	public ResultSetClass(int colName, String colDataType) {
		this.colName = colName;
		this.colDataType = colDataType;
	}
	public int getColName() {
		return colName;
	}
	public void setColName(int colName) {
		this.colName = colName;
	}
	public String getColDataType() {
		return colDataType;
	}
	public void setColDataType(String colDataType) {
		this.colDataType = colDataType;
	}
	
	public boolean next() {
		if(true) {
			return true;
		}
		else { return false;}
	}
	
	
}
