package com.durgasoft.entities;

public class Department {
    private String departmentId;
    private String departmentName;
    private Employee[] employees; // One-to-many

    public Department(String departmentId, String departmentName, Employee[] employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void getDepartmentDetails(){
        System.out.println("Department Details ");
        System.out.println("----------------------");
        System.out.println("Departmenet ID : "+ departmentId);
        System.out.println("Department Name : " + departmentName);
        System.out.println();

        for(Employee employee : employees){
            employee.getEmployeeDetails();
        }
    }
}
