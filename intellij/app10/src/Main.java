import com.durgasoft.entities.Employee;
import com.durgasoft.entities.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("p1",
                "Durga",
                "Hyd",
                "S-111",
                "BTech",
                7.5f,
                "JNTUH");

        student.getStudentDetails();
        System.out.println();

        Employee employee = new Employee(
                "p2",
                "Pavan",
                "Hyd",
                "E-111",
                "MBA",
                50000.0F,
                "HR Admin"
        );
        employee.getEmployeeDetails();
    }
}