package com.jayant.test;

public class BankAccount {

	private String owner;
	private double balance;

	BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = Math.max(balance, 0);
	}

	public String getOwner() {
		return this.owner;
	}

	public double getBalance() {
		return this.balance;
	}

	public double deposit(double depositAmount) {
		if (depositAmount > 0) {
			this.balance = this.balance + depositAmount;
		}
		return 0;
	}

	public double withdraw(double withdrawalAmount) {
		if(withdrawalAmount <= this.balance) {
			this.balance = this.balance - withdrawalAmount;
			return withdrawalAmount;
		}
		return 0;
	}

}
