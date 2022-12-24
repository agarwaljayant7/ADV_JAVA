package com.durgasoft.app07.entities;

public class Student {
    private String sid;
    private String sname;
    private String saddr;
    private Branch branch;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void getStudentDetails(){
        System.out.println("Student details");
        System.out.println("-----------------");
        System.out.println("Student Id :  " + sid);
        System.out.println("Student name : " + sname);
        System.out.println("Student addre : " + saddr);

        System.out.println("Branch Details");
        System.out.println("---------------------");
        System.out.println("Branch Id :" + branch.getBranchId());
        System.out.println("Branch Name : " + branch.getBranchName());
        System.out.println();
    }
}
