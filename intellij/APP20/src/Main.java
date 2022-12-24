import com.durgasoft.app20.entities.Student;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("S-111", "JAYANT", "Hyd");
        System.out.println("Student detail from original object");
        student1.getStudentDetails();
        System.out.println(student1.toString());
        Student student2 = (Student)student1.clone();
        System.out.println("\nStudent details from duplicate object");
        student2.getStudentDetails();
        System.out.println(student2.toString());
    }
}