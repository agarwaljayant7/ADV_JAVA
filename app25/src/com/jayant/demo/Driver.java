package com.jayant.demo;

public class Driver {

	public static void main(String[] args) {
		
		ConnectionI connection = null;
				
		StatementI statement = connection.createStatement();
		
		statement.executeUpdate();
		
	}

}
