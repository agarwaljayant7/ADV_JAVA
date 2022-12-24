import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");
        stack.push("DDD");
        stack.push("EEE");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("AAA"));
        System.out.println(stack.search("DDD"));
        System.out.println(stack.search("EEE"));

//
//      try(
//              Connection connection = DriverManager.getConnection("jdbc:mysql:localhost:3306", "root", "root");
//              Statement statement = connection.createStatement();
//              ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP1");
//              ){
//          System.out.println("ENO\tENAME\tESAL\tEADDR");
//          System.out.println("-----------------------------");
//
//      }
//      catch(Exception e){
//          e.printStackTrace();
//      }
    }
}