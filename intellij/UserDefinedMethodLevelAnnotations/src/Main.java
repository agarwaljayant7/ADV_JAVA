import com.durgasoft.annotations.Course;
import com.durgasoft.entities.Student;

import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student = new Student("S-111", "DURGA", "HYD");
        student.getStudentDetails();
        System.out.println();
        Class cls = Student.class;
        Method method = cls.getMethod("getStudentDetails");


//        Course course = method.getAnnotation(Course.class);
//
//        System.out.println("Course Details");
//        System.out.println("--------------------");
//        System.out.println("Course Id  : " +course.cid());
//        System.out.println("Course Name  :  " + course.cname());
//        System.out.println("Course Cost  : " + course.ccost());

        Course[] courses = method.getAnnotationsByType(Course.class);
        System.out.println("CID\tCNAME\tCCOST");
        System.out.println("------------------------");
        for(Course course : courses){
            System.out.println(course.cid() + "\t");
            System.out.println(course.cname() + "\t");
            System.out.println(course.ccost());
        }
    }
}