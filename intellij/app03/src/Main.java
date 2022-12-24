import com.durgasoft.app03.entities.Account;
import com.durgasoft.app03.entities.Employee;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.setAccNo("abc123");
        account.setAccHolderName("Durga");
        account.setAccType("Saving");
        account.setAccBalance(10000);

        Employee employee = new Employee();
        employee.setEno(111);
        employee.setEname("Durga N");
        employee.setEsal(50000);
        employee.setEaddr("Hyd");
        employee.setAccount(account); // one-to-one

        employee.getEmployeeDetails();
    }
}