import com.durgasoft.annotations.Bank;
import com.durgasoft.entities.Account;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
      Account account = new Account("abc123", "Durga N", "Savings", 25000);
      account.getAccountDetails();
      Class cls = Account.class;

        Bank bank  = (Bank) cls.getAnnotation(Bank.class);
        System.out.println("Bank Details");
        System.out.println("------------------");
        System.out.println("Bank Id    : " + bank.bankId());
        System.out.println("Bank Name  : " + bank.bankName());
        System.out.println("Bank Branch : " + bank.branchName());
        System.out.println("Mobile Num  : " + bank.mobile());
        System.out.println("Websirte Name  : " + bank.website());

    }
}