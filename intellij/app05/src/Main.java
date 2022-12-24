import com.durgasoft.app05.entities.Department;
import com.durgasoft.app05.entities.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setEid("E-111");
        employee1.setEname("AAA");
        employee1.setEsal(5000);
        employee1.setEaddr("Hyd");

        Employee employee2 = new Employee();

        employee2.setEid("E-222");
        employee2.setEname("BBB");
        employee2.setEsal(5000);
        employee2.setEaddr("Hyd");

        Employee employee3 = new Employee();

        employee3.setEid("E-333");
        employee3.setEname("CCC");
        employee3.setEsal(5000);
        employee3.setEaddr("Hyd");

        Employee[] employees =
                {
                  employee1,
                  employee2,
                  employee3
                };
        Department department
                = new Department();
        department.setDepartmentId("D-11");
        department.setDepartmentName("Admin");
        department.setEmployees(employees);
        department.getDepartmentDetails();
    }
}