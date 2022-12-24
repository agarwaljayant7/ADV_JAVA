package predefinedannotations;

import java.util.ArrayList;
import java.util.List;

 class Bank {
//     @SuppressWarnings("unchecked")
     @SuppressWarnings("")
    public void displayAccountHolderName(){
        List list = new ArrayList();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        System.out.println(list);

    }
}

public class Main{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.displayAccountHolderName();
    }
}
