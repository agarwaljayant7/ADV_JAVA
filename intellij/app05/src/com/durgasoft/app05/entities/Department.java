package com.durgasoft.app05.entities;

public class Department {

    private String departmentId;
    private String departmentName;
    private Employee[] employees;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void getDepartmentDetails(){
        System.out.println("Department details          ");
        System.out.println("---------------");
        System.out.println("Department Id          " + departmentId);
        System.out.println("Department name " + departmentName);

        System.out.println();

        for(Employee employee : employees){
            System.out.println(employee.getEid());
            System.out.println(employee.getEname());
            System.out.println(employee.getEsal());
            System.out.println(employee.getEaddr());
            System.out.println();
        }



    }
}
