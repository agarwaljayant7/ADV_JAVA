import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args)
    {
       try(

               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
               PreparedStatement preparedStatement = connection.prepareStatement("SELECT *  FROM EMP1", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               ResultSet resultSet = preparedStatement.executeQuery();
               )
       {
           System.out.println("Employee Details in forward direction");
           System.out.println("ENO\tENAME\tESAL\tEADDR");
           System.out.println("--------------------------------------");

           while(resultSet.next()){
               System.out.print(resultSet.getInt("ENO") + "\t");
               System.out.print(resultSet.getString("ENAME") + "\t");
               System.out.print(resultSet.getFloat("ESAL") + "\t");
               System.out.print(resultSet.getString("EADDR") + "\n");
           }

           System.out.println();

           System.out.println("Employee Details in backward direction");
           System.out.println("ENO\tENAME\tESAL\tEADDR");
           System.out.println("--------------------------------------");

           while(resultSet.previous()){
               System.out.print(resultSet.getInt("ENO") + "\t");
               System.out.print(resultSet.getString("ENAME") + "\t");
               System.out.print(resultSet.getFloat("ESAL") + "\t");
               System.out.print(resultSet.getString("EADDR") + "\n");
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}