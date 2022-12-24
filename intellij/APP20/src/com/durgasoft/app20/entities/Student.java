package com.durgasoft.app20.entities;

public class Student implements Cloneable{
   private String sid;
   private String sname;
   private String saddr;

    public Student(String sid, String sname, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }
    public void getStudentDetails(){
        System.out.println("Student Details  : ");
        System.out.println("----------------------");
        System.out.println("Student    Id    : " + sid);
        System.out.println("Student    name  : " + sname);
        System.out.println("Student    address  : " + saddr);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
