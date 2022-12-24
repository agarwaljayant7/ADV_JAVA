import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int eno = 111;
    Account account = new Account();
}

class Account implements Serializable{
    String accNo = "abc123";
    Branch branch = new Branch();
}

class Branch implements Serializable{
    int branchId = 123456;
    Bank bank = new Bank();
}
class Bank implements Serializable{
    int bankId = 123;
}
public class Main {
    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Jayant/Desktop/docs/abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Employee employee = new Employee();
        objectOutputStream.writeObject(employee);
        System.out.println("Employee Object Serialized........");
    }
}