package com.durgasoft.app02.entities;

public class Employee {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    private Account account; // One-to-One

    public Employee(int eno, String ename, float esal, String eaddr, Account account) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details            :");
        System.out.println("-------------------------------");
        System.out.println("Employee Number             :" + eno);
        System.out.println("Employee Name               :" + ename);
        System.out.println("Employee Salary             :" + esal);
        System.out.println("Employee Addres             :" + eaddr);

        System.out.println();
        account.getAccountDetails();

    }
}
