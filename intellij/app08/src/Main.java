import com.jayant.entities.Course;
import com.jayant.entities.Student;

public class Main {
    public static void main(String[] args) {


        Course course1 = new Course("C1", "JAVA", 10000);
        Course course2 = new Course("C2", ".net", 20000);
        Course course3 = new Course("C3", "PYTHON", 30000);
        Course course4 = new Course("C4", "ORACLE", 40000);

        Course[] courses = {course1,course2,
                course3, course4};

        Student student1 = new Student("S1", "AAA", "Hyd", courses);
        Student student2 = new Student("S2", "BBB", "Hyd", courses);
        Student student3 = new Student("S3", "CCC", "Hyd", courses);
        Student student4 = new Student("S4", "DDD", "Hyd", courses);

        student1.getStudentDetails();
        student2.getStudentDetails();
        student3.getStudentDetails();
        student4.getStudentDetails();

    }
}