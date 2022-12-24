import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws  Exception{
      try(
              Scanner scanner = new Scanner(System.in);
          ){
          System.out.print("Employee Numner    : ");
          int eno = scanner.nextInt();

          System.out.println("Employee Name    : ");
          String ename = scanner.nextLine();

          System.out.println("Employee Salary  : ");
          float esal = scanner.nextFloat();


          System.out.println("Employee Address  : ");
          String eaddr = scanner.next();

          System.out.println("Employee Details ");
          System.out.println("-------------------------");
          System.out.println("Employee number     : " + eno);
          System.out.println("Employee name       : " + ename);
          System.out.println("Employee Salary     : " + esal);
          System.out.println("Employee Address    : " + eaddr);
      }
      catch(Exception e){
          e.printStackTrace();
      }
    }
}
