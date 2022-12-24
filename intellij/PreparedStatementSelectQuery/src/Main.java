import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb","root","root");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMP1 WHERE ENAME = ?");
//                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMP1");
//                ResultSet resultSet = preparedStatement.executeQuery();

                )
        {
            System.out.println("Enter the employee ename : ");
            String ename = bufferedReader.readLine();


//            System.out.println("ENO\tENAME\tESAL\t\tEADDR");
//            while(resultSet.next()){
//                System.out.print(resultSet.getInt("ENO")+"\t");
//                System.out.print(resultSet.getString("ENAME") + "\t");
//                System.out.print(resultSet.getFloat("ESAL") + "\t");
//                System.out.print(resultSet.getString("EADDR") + "\n");

//            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}