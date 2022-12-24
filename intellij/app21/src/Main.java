import com.jayant.app21.entities.Account;
import com.jayant.app21.entities.Employee;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account account1 = new Account("abc123",
                "Durga", "Savings");
        Employee emp1 = new Employee(111, "Durga", 5000, "Hyd", account1);

        System.out.println("Employee details from original object");
        emp1.getEmployeeDetails();
        System.out.println("Account details from original object");
        emp1.account.getAccountDetails();

        System.out.println("Original emp obj ref : " + emp1);
        System.out.println("Original Account obj ref : " + emp1.account);

        System.out.println();

        Employee emp2 = (Employee)emp1.clone();
        System.out.println("Employee Details from Duplicate Employee Object ");
        emp2.getEmployeeDetails();
        System.out.println("Account details from duplicate account object");
        emp2.account.getAccountDetails();
        System.out.println("Duplicate Employee obj ref : " + emp2);
        System.out.println("Duplicate Account obje ref : " + emp2.account);
    }
}