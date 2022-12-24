import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMP1 VALUES(? , ?, ?, ?)");
                )
        {
            while(true){
                System.out.print("Employee Number    : ");
                int eno = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Employee Name    : ");
                String ename = bufferedReader.readLine();

                System.out.println("Employee Salary  : ");
                float esal = Float.parseFloat(bufferedReader.readLine());

                System.out.println("Employee Address : ");
                String eaddr = bufferedReader.readLine();

                preparedStatement.setInt(1, eno);
                preparedStatement.setString(2, ename);
                preparedStatement.setFloat(3, esal);
                preparedStatement.setString(4, eaddr);

                preparedStatement.addBatch();
                System.out.println("Employee " + eno + " Added to the Batch");

                System.out.println("One more employee [yes/ no]   : ");
                String option = bufferedReader.readLine();

                if(option.equalsIgnoreCase("yes")){
                    continue;
                }else{
                    break;
                }

            }

            int[] rowCounts = preparedStatement.executeBatch();

            for(int rowCount : rowCounts){
                System.out.println("RowCount         : " + rowCount);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}