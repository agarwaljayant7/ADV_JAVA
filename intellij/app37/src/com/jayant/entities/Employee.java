package com.jayant.entities;

import java.io.Serializable;

public class Employee implements Serializable {

    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    public Employee(int eno, String ename, float esal, String eaddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }
    public void getEmpDetails(){
        System.out.println("Employee Details");
        System.out.println("-----------------------");
        System.out.println("Employee number        : " + eno);
        System.out.println("Employee Name          : " + ename);
        System.out.println("Employee Salary        : " + esal);
        System.out.println("Employee Address       : " + eaddr);
    }
}
