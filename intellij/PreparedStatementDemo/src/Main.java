import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb","root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into emp1 values(?,?,?,?)");
                ) {

            while (true) {
                System.out.println("Employee Number    : ");
                int eno = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Employee Name      : ");
                String ename = bufferedReader.readLine();

                System.out.println("Employee Salary    : ");
                float esal = Float.parseFloat(bufferedReader.readLine());

                System.out.println("Employee address      : ");
                String eaddr = bufferedReader.readLine();

                preparedStatement.setInt(1, eno);
                preparedStatement.setString(2, ename);
                preparedStatement.setFloat(3, esal);
                preparedStatement.setString(4, eaddr);

                int rowCount = preparedStatement.executeUpdate();

                if (rowCount == 1) {
                    System.out.println("Employee " + eno + " inserted successfully");

                    System.out.println("One more employee [Yes/No] ? ");
                    String option = bufferedReader.readLine();

                    if (option.equalsIgnoreCase("yes")) {
                        continue;
                    } else {
                        break;
                    }
                } else {

                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}