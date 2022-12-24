import com.jayant.entities.Course;
import com.jayant.entities.Student;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setCid("C1");
        course1.setCname("Java");
        course1.setCcost(10000);

        Course course2 = new Course();
        course2.setCid("C2");
        course2.setCname("Python");
        course2.setCcost(20000);

        Course course3 = new Course();
        course3.setCid("C3");
        course3.setCname("Oracle");
        course3.setCcost(30000);

        Course[] courses =
                {
                        course1,
                        course2,
                        course3
                };

        Student student1 = new Student();
        student1.setSid("S1");
        student1.setSname("AAA");
        student1.setSaddr("Hyd");
        student1.setCourses(courses);

        Student student2 = new Student();
        student2.setSid("S2");
        student2.setSname("BBB");
        student2.setSaddr("Hyd");
        student2.setCourses(courses);

        Student student3 = new Student();
        student3.setSid("S3");
        student3.setSname("CCC");
        student3.setSaddr("Hyd");
        student3.setCourses(courses);

        student1.getStudentDetails();
        student2.getStudentDetails();
        student3.getStudentDetails();

    }
}