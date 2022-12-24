package com.durgasoft.app02.entities;

public class Account {
    private String accNo;
    private String accHolderName;
    private String accType;
    private int accBalance;

    public Account(String accNo, String accHolderName, String accType, int accBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public void getAccountDetails(){
        System.out.println("Account Details");
        System.out.println("----------------------");
        System.out.println("Account number       : " + accNo);
        System.out.println("Account Holder name  : " + accHolderName);
        System.out.println("Account number       : " + accType);
        System.out.println("Account number       : " + accBalance);
    }
}
