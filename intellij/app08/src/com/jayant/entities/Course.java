package com.jayant.entities;

public class Course {
    private String cid;
    private String name;
    private int ccost;

    public Course(String cid, String name, int ccost) {
        this.cid = cid;
        this.name = name;
        this.ccost = ccost;
    }

    public void getCourseDetails(){
        System.out.println(cid + "\t");
        System.out.println(name + "\t");
        System.out.println(ccost + "\t");
    }
}
