import javax.annotation.processing.SupportedOptions;
import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
                Connection connection = DriverManager.getConnection("jdbc:mysql:localhost:3306/jayantdb", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE EMP1 SET ESAL = ESAL + ? WHERE ESAL < ? ");
                )
        {
            System.out.println("Bonus Amount   :");
            int bonusAmount = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Salary Range   : ");
            float salaryRange = Float.parseFloat(bufferedReader.readLine());

            preparedStatement.setInt(1, bonusAmount);
            preparedStatement.setFloat(2, salaryRange);

            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Employee updated  : " + rowCount);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}