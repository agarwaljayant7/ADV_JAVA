import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
//                Statement statement = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM reg_users WHERE UNAME = ? and UPWD = ?");

                )
        {
            System.out.println("User name : ");
            String uname = bufferedReader.readLine();
            System.out.println("Password  : ");
            String upwd = bufferedReader.readLine();         //OR 'Z'='Z

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM reg_users WHERE UNAME = '" +
//                    uname + "' and UPWD = '"+upwd+"'" );

            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, upwd);

            ResultSet resultSet = preparedStatement.executeQuery();

            boolean b = resultSet.next();
            if(b){
                System.out.println("Login success");
            }else{
                System.out.println("User not existed, Login failure");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}