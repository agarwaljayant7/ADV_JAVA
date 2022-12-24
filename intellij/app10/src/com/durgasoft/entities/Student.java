package com.durgasoft.entities;

public class Student extends Person{
    private String studentId;
    private String studentQualification;
    private float aggregateMarks;
    private String college;

    public Student(String personId,String personName, String personAddress, String studentId,
                   String studentQualification, float aggregateMarks, String college) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
        this.studentId = studentId;
        this.studentQualification = studentQualification;
        this.aggregateMarks = aggregateMarks;
        this.college = college;
    }

    public void getStudentDetails(){
        System.out.println("Student details");
        System.out.println("--------------------");
        getPersonDetails();
        System.out.println("Student id              : " + studentId);
        System.out.println("Student Qualification   : " + studentQualification);
        System.out.println("Student Aggregate Marks : " + aggregateMarks);
        System.out.println("Student College        : "  + college);
    }
}
