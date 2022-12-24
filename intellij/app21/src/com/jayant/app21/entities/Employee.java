package com.jayant.app21.entities;

public class Employee implements Cloneable{

     int eno;
    String ename;

     float esal;
    String eaddr;

     public Account account;

    public Employee(int eno, String ename, float esal, String eaddr, Account account) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("--------------------");
        System.out.println("Empno  : " + eno);
        System.out.println("Ename  : " + ename);
        System.out.println("Esal   : " + esal);
        System.out.println("Eaddr  : " + eaddr);
        System.out.println("Account detail : ");
        System.out.println("------------------------");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Account newAccount = new Account(account.accNo, account.accHolderName, account.accType);
        Employee employee = new Employee(eno, ename, esal, eaddr, account);
        return super.clone();
    }
}
