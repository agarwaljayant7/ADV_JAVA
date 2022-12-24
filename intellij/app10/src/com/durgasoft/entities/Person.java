package com.durgasoft.entities;

public class Person {
     String personId;
     String personName;
     String personAddress;

    public void getPersonDetails(){
        System.out.println("Person Id       : " + personId);
        System.out.println("Person name     : " + personName);
        System.out.println("Person address  : " + personAddress);
    }
}
