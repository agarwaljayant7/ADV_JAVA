package com.jayant.polymorphism;

public class PhoneNumber {

	private int countryCode;
	private String phoneNumber;
	
	public PhoneNumber(String phoneNumber) {
		if(phoneNumber.length() > 10) {
			this.countryCode = Integer.parseInt(phoneNumber);
		}
	}

	public PhoneNumber(int countryCode, String phoneNumber) {
		
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}
	
	
}
