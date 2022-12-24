import com.durgasoft.entities.Department;
import com.durgasoft.entities.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("E-111", "Durga", 5000, "Hyd");
        Employee employee2 = new Employee("E-222", "Rakesh", 6000, "Hyd");
        Employee employee3 = new Employee("E-333", "Ramesh", 7000, "Hyd");
        Employee employee4 = new Employee("E-444", "Pavan", 5000, "Hyd");

        Employee[] employees =  {employee1, employee2, employee3, employee4};
        Department department = new Department(
                "D-111", "Admin", employees);

        department.getDepartmentDetails();
    }
}