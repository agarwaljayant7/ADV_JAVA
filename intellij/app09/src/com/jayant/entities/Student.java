package com.jayant.entities;

public class Student {
    private String sid;
    private String sname;
    private String saddr;
    private Course[] courses;

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

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

   public void getStudentDetails(){
       System.out.println("Student details");
       System.out.println("-------------------");
       System.out.println("Student Id : " + sid);
       System.out.println("Student Name : " + sname);
       System.out.println("Student Addr : " + saddr);
       System.out.println("CRD\tCNAM\tCCOST");
       System.out.println("-----------------------");
       for(Course course : courses){
           System.out.print(course.getCid() + "\t");
           System.out.println(course.getCname() + "\t");
           System.out.println(course.getCcost() + "\n");
       }


    }
}
