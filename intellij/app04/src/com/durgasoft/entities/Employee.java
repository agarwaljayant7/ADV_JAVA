package com.durgasoft.entities;

public class Employee {
    private String eid;
    private String ename;
    private float esal;
    private String eaddr;

    public Employee(String eid, String ename, float esal, String eaddr) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Details ");
        System.out.println("------------------------");
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee Salary: " + esal);
        System.out.println("Employee Address:  " + eaddr);

    }
}
