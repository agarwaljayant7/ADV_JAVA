import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb","root","root");
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUCT VALUES(?, ?, ?, ?)");
        )
        {

//            System.out.println(new java.sql.Date(new java.util.Date().getTime()));

            while(true){
                System.out.println("Product Id          : ");
                String productId = bufferedReader.readLine();

                System.out.println("Product Name        : ");
                String productName = bufferedReader.readLine();

                System.out.println("Manufacturing Date  : ");
                java.sql.Date mfgDate = java.sql.Date.valueOf(bufferedReader.readLine());

                System.out.println("Expiry Date          : ");
                java.sql.Date expDate = java.sql.Date.valueOf(bufferedReader.readLine());


                preparedStatement.setString(1, productId);
                preparedStatement.setString(2, productName);
                preparedStatement.setDate(3, mfgDate);
                preparedStatement.setDate(4, expDate);

                int rowCount = preparedStatement.executeUpdate();
                if(rowCount == 1){
                    System.out.println("Product inserted successfully");
                    System.out.println("One more product  [ Yes/ No ] ?  : ");
                    String option = bufferedReader.readLine();

                    if(option.equalsIgnoreCase("yes")){
                        continue;
                    }else{
                        break;
                    }
                }else{
                    System.out.println("Product not inserted successfully");
                    break;
                }
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}