package com.durgasoft.entities;

import com.durgasoft.annotations.Course;

import java.lang.annotation.Repeatable;


public class Student {


    private String sid;
    private String sname;
    private String saddr;

    public Student(String sid, String sname, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }

    @Course(cid = "C-222", cname="Oracle", ccost = 10000)
    @Course(cid = "C-333", cname = "UITEch", ccost = 5000)
    public void getStudentDetails(){
        System.out.println("Student details");
        System.out.println("----------------------");
        System.out.println("Student Id       : " + sid);
        System.out.println("Student name     : " + sname);
        System.out.println("Student address  : " + saddr);
    }
}
