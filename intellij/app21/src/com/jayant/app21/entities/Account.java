package com.jayant.app21.entities;

public class Account {

     String accNo;
     String accHolderName;
     String accType;

    public Account(String accNo, String accHolderName, String accType) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
    }

    public void getAccountDetails(){
        System.out.println("Account Details");
        System.out.println("-------------------");
        System.out.println("Account Number :" + accNo);
        System.out.println("Account Holder name : " + accHolderName);
        System.out.println("Account type   : " + accType);

    }
}
