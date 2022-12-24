import com.durgasoft.app02.entities.Account;
import com.durgasoft.app02.entities.Employee;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("abc123",
                "Durga", "Savings",
                            10000);

        Employee employee = new Employee(111, "Durga",
                5000, "Hyd", account);

        employee.getEmployeeDetails();

    }
}