package com.durgasoft.entities;

import com.durgasoft.annotations.Bank;

@Bank(bankId = "B-222", bankName = "HDFC Bank", website = "www.hdfcbank.com/ameerpet", mobile = 1122345234)
public class Account {

    private String accNum;
    private String accHolderName;
    private String accType;
    private int accBalance;

    public Account(String accNum, String accHolderName, String accType, int accBalance) {
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public void getAccountDetails(){

        System.out.println("Account Details");
        System.out.println("-------------------------");
        System.out.println("Account Number : " + accNum);
        System.out.println("Account Holder Name : " + accHolderName);
        System.out.println("Accounnt Type : " + accType);
        System.out.println("Account balance : " + accBalance);

    }
}
