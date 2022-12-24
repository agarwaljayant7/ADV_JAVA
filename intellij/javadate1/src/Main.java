import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMP25 VALUES(?, ?, ?, ?)");

                )
        {
//            preparedStatement.setInt(1, 111);
//            preparedStatement.setString(2, "Jayant");
//            preparedStatement.setDate(3, java.sql.Date.valueOf("1996-07-11"));
//            preparedStatement.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
//            preparedStatement.executeUpdate();
//
//            System.out.println("Employee 111 inserted successfully");
//
//            preparedStatement.setInt(1, 222);
//            preparedStatement.setString(2, "Nag");
//            preparedStatement.setDate(3, java.sql.Date.valueOf("1997-08-12"));
//            preparedStatement.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
//            preparedStatement.executeUpdate();

            System.out.println("Employee 222 inserted successfully");
            System.out.println(new java.sql.Date(new java.util.Date().getTime()));
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}