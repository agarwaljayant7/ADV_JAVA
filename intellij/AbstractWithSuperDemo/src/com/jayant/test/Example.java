package com.jayant.test;

interface DBDriver{  // Sun microsystems
    void registerDriver();
    void connect();
}

class OracleDriver implements DBDriver{
    public void registerDriver(){
        System.out.println("Oracle Driver Registerd Successfull");
    }
    public void connect(){
        System.out.println("Connection established between Java application and Oracle Database");
    }
}

class MySQLDriver implements DBDriver{

    @Override
    public void registerDriver() {
        System.out.println("MYSQL Driver registerd successfully");
    }

    @Override
    public void connect() {
        System.out.println("Connection est. b/w java app and MYSQL databases");
    }
}

class MSAccessDriver implements DBDriver{

    public void registerDriver() {
        System.out.println("MSACCESS Driver registerd successfully");

    }

    public void connect() {
        System.out.println("Connection est. b/w java app and MYACCESS databases");
    }

}
public class Example {
    public static void main(String[] args) {
       DBDriver oracleDriver = new OracleDriver();
        oracleDriver.registerDriver();
       oracleDriver.connect();

        System.out.println();

       DBDriver mySqlDriver = new MySQLDriver();
       mySqlDriver.registerDriver();
       mySqlDriver.connect();
        System.out.println();

       DBDriver msAccessDriver = new MSAccessDriver();
       msAccessDriver.registerDriver();
        msAccessDriver.connect();

    }
}
