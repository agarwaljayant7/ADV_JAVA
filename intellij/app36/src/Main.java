import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
       Console console = System.console();

       String uname = console.readLine("User Name : ");
       char[] upwd = console.readPassword("Password : ");
       String password = new String(upwd);

       if(uname == "durga" && password.equals("durga")){
           System.out.println("Login success");
       }
       else{
           System.out.println("Login failure");
       }
    }
}