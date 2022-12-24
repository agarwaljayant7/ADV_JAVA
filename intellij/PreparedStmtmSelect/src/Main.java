import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM EMP1 WHERE ESAL < ? ");
        )
        {

            System.out.println("Salary Range  :");
            float salaryRange = Float.parseFloat(bufferedReader.readLine());
            preparedStatement.setFloat(1 , salaryRange);

            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Employees updated : " + rowCount);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}