import com.jayant.entities.Employee;

import java.io.*;

class Employee1 implements Serializable{
    int eno = 111;
    String ename = "Durga";
    private int empPin = 12345;
}
class Manager extends Employee1{
    float esal = 50000.0f;
    String qual = "MBA";
    private String sysKey = "abc123";
}

public class Main {
    public static void main(String[] args)throws Exception {

        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(new FileOutputStream("C:/Users/Jayant/Desktop/java/emp1.txt"));
        objectOutputStream.writeObject(new Manager());
        System.out.println("Serialization performed successfully");
//        Employee employee1 = new Employee(111, "Durga", 5000.0f, "Hyd");
//
//        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Jayant/Desktop/java/emp.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
////        objectOutputStream.writeObject(employee1);
//
//        System.out.println("Employee Details before Serialization");
//        employee1.getEmpDetails();
//        objectOutputStream.writeObject(employee1);
//
//        System.out.println();
//
//        FileInputStream fileInputStream = new FileInputStream("C:/Users/Jayant/Desktop/java/emp.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        System.out.println(employee1);
//
//        Employee employee2 = (Employee) objectInputStream.readObject();
//        System.out.println("Employee Details after Deserialization ");
//        employee2.getEmpDetails();
//
//        System.out.println(employee2);
//        fileInputStream.close();
//        fileOutputStream.close();
//        objectInputStream.close();
//        objectOutputStream.close();
    }
}