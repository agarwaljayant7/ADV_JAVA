import com.jayant.app39.entities.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Jayant/Desktop/docs/student.txt");

                FileInputStream fileInputStream = new FileInputStream("C:/Users/Jayant/Desktop/docs/student.txt");
                ){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Student student1 = new Student("DSS-111", "Durga", "durga@durgasoft.com", "91-9988776655");
            System.out.println("Student details before Serialization");
            student1.getStudentDetails();

            System.out.println("Serialization performed successfully");
            objectOutputStream.writeObject(student1);

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student2 = (Student) objectInputStream.readObject();

            System.out.println("Student Details after de-serialization");
            student2.getStudentDetails();

            objectInputStream.close();
            objectOutputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}