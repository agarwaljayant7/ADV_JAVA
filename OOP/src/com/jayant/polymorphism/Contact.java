package com.jayant.polymorphism;

public class Contact {
	private String name;
	private String phoneNumber;
	private String emailAddress;
	
	public Contact (String name, String phoneNumber, String emailAddress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumner;
	}
	
	
	
	
	public Contact(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}
}
