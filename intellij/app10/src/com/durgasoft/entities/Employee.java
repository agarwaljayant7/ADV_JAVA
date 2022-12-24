package com.durgasoft.entities;

public class Employee extends Person{
    private String employeeId;
    private String employeeQualification;
    private float employeeSalary;
    private String employeeDesignation;

    public Employee(String personId,
                    String personName,
                    String personAddress,
                    String employeeId,
                    String employeeQualification,
                    float employeeSalary,
                    String employeeDesignation) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
        this.employeeId = employeeId;
        this.employeeQualification = employeeQualification;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("-------------------");
        getPersonDetails();
        System.out.println("Employee Id         : " + employeeId);
        System.out.println("Employee Details    : " + employeeQualification);
        System.out.println("Employee Details    : " + employeeSalary);
        System.out.println("Employee Details    : " + employeeDesignation);

    }
}
