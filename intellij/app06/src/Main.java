import com.durgasoft.app05.entities.Branch;
import com.durgasoft.app05.entities.Student;

public class Main {
    public static void main(String[] args) {

        Branch branch = new Branch(111, "Mech");


        Student student1 = new Student(111, "AAA", branch);
        Student student2 = new Student(222, "BBB", branch);
        Student student3 = new Student(344, "CCC", branch);

        Student[] students = {student1, student2, student3};

        for(Student student : students){
            student.getStudentDetails();
        }
    }
}