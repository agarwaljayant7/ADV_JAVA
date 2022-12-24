import java.sql.*;

public class Main {
    public static void main(String[] args) {
       try(
               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb","root", "root");
               PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCT");
               ResultSet resultSet = preparedStatement.executeQuery();
               )
       {
           System.out.println("PID\tPNAME\tMFGDATE\tEXPDATE");
           System.out.println("----------------------------------");

           while(resultSet.next()){
               System.out.print(resultSet.getString("PID") +"\t");
               System.out.print(resultSet.getString("PNAME") + "\t");
               System.out.print(resultSet.getDate("MFGDATE") + "\t");
               System.out.print(resultSet.getDate("EXPDATE") + "\n");
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}