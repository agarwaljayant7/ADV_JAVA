import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try(
                FileOutputStream fileOutputStream =
new FileOutputStream("C:/Users/Jayant/Desktop/docs/abc.txt", true);

        )
        {
        String data = " Jayant bangalore";
        byte[] byteDate = data.getBytes();
        fileOutputStream.write(byteDate);
            System.out.println("Data transferred successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}