import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root","root");
                Statement statement = connection.createStatement();
                ){
            statement.addBatch("INSERT INTO STUDENT VALUES(555, 'EEE','HYD')");
            statement.addBatch("INSERT INTO STUDENT VALUES(666, 'FFF','HYD')");
            statement.addBatch("INSERT INTO STUDENT VALUES(777, 'GGG','BLR')");
            statement.addBatch("INSERT INTO STUDENT VALUES(888, 'HHH','CHN')");
            statement.addBatch("INSERT INTO STUDENT VALUES(999, 'JJJ','KERALA')");
//            statement.addBatch("UPDATE STUDENT SET SADDR = 'BLR'");
//            statement.addBatch("DELETE FROM STUDENT WHERE SID = 555");
            int[] rowCounts = statement.executeBatch();
            for(int rowCount : rowCounts){
                System.out.println("RowCount : " + rowCount);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}