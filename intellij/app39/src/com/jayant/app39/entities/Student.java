package com.jayant.app39.entities;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

    private String sid;
    private String sname;
    private String semail;
    private String smobile;

    public Student(String sid, String sname, String semail, String smobile) {
        this.sid = sid;
        this.sname = sname;
        this.semail = semail;
        this.smobile = smobile;
    }

    public Student() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        try{
            System.out.println("***** Inside writeExternal() method *****");
            // sid manipulations, DSS-111 ==> 111
            String[] items1 = sid.split("-");
            int sno = Integer.parseInt(items1[1]);
            System.out.println("############" + sid + "============>" + sno);

            //semail manipulations, aaa@durgasoft.com ==> aaa
            String[] items2 = semail.split("@");
            String mailId = items2[0];

            //smobile manipulations, 91-9988776655
            String[] items3 = smobile.split("-");
            long mobileNumber = Long.parseLong(items3[1]);

            out.writeInt(sno);
            out.writeUTF(sname);
            out.writeUTF(mailId);
            out.writeLong(mobileNumber);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("******** Inside readExternal() method ********");
        sid = "DSS-" + in.readInt();
        sname = in.readUTF();
        semail = in.readUTF() + "@durgasoft.com";
        smobile = "91-" + in.readLong();
    }

    public void getStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------------");
        System.out.println("Student Id          : " + sid);
        System.out.println("Student name        : " + sname);
        System.out.println("Student email id    : " + semail);
        System.out.println("Student mobil       : " + smobile);
    }
}
