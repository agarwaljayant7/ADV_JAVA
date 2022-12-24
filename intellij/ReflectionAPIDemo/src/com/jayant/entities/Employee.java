package com.jayant.entities;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

class Person{
    public String pid;
    protected String pqual;

}
public final class Employee extends Person implements Serializable, Remote, Cloneable {
    public  int eno = 111;
    private static String ename = "ABC";
    protected static float esal = 50000.0f;
    public String eaddr;

//    public Employee(int eno) {
//        this.eno = eno;
//    }
//
//    protected Employee(int eno, String ename) {
//        this.eno = eno;
//        this.ename = ename;
//    }
//
//    public Employee(int eno, String ename, float esal) {
//        this.eno = eno;
//        this.ename = ename;
//        this.esal = esal;
//    }
//
//    public Employee(int eno, String ename, float esal, String eaddr)throws CloneNotSupportedException {
//        this.eno = eno;
//        this.ename = ename;
//        this.esal = esal;
//        this.eaddr = eaddr;
//    }


    public void add(int eno, String ename, float esal, String eaddr)throws RemoteException {

    }

     String search(int no)throws NoSuchElementException {
        return "";
    }

    public float update(int eno, String ename, float esal, String eaddr)throws ConcurrentModificationException {
        return 0.0f;
    }
    public void delete(int eno)throws CloneNotSupportedException{

    }


}
