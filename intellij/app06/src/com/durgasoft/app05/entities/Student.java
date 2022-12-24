package com.durgasoft.app05.entities;

public class Student {
    private int sid;
    private String sname;

    private Branch branch;

    public Student(int sid, String sname, Branch branch) {
        this.sid = sid;
        this.sname = sname;
        this.branch = branch;
    }

    public void getStudentDetails(){
        System.out.println("Student Details ");
        System.out.println("------------");
        System.out.println("Student id : "+ sid);
        System.out.println("Student name : " + sname);
        System.out.println();
        System.out.println("Branch Details");
        System.out.println("Branch Id : " + branch.getbId());
        System.out.println("Branch name : " + branch.getbName());
        System.out.println();
    }
}
