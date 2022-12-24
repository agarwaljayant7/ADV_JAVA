

class Bank{
    public void displayCustomerName(String[] customerNames){
        for(String customerName : customerNames){
            System.out.println(customerName);
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        String[] customerNames = {"AAA", "BBB", "CCC", "DDD"};
        bank.displayCustomerName(customerNames);
        System.out.println();

        bank.displayCustomerName(new String[]{"XXXX","YYYY","ZZZZ"});

//       int[] a = new int[]{10, 20 , 30, 40, 50};
//
//       for(int val : a){
//           System.out.println(val);
//       }

    }
}