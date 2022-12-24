package com.jayant.entities;

public class Student {
    private String sid;
    private String sname;
    private String saddr;

    private Course[] courses;


    public Student(String sid, String sname, String saddr, Course[] courses) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.courses = courses;
    }

    public void getStudentDetails(){
        System.out.println("Student details");
        System.out.println("---------------------");

        System.out.println("Student id : " + sid);
        System.out.println("Student name : " + sname);
        System.out.println("Student address : + " + saddr);
        System.out.println("COD CNAME COST");
        System.out.println("------------------");
        for(Course course : courses){
            course.getCourseDetails();
        }
        System.out.println();

    }
}
