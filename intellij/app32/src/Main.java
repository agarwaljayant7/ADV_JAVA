import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(
                FileInputStream fileInputStream = new FileInputStream("C:/Users/Jayant/Desktop/flower.jpg");
                FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Jayant/Desktop/flower1.jpeg");
                ){
            byte[] byteArray = new byte[fileInputStream.available()];
            fileInputStream.read(byteArray);

            String string = new String(byteArray);
            fileOutputStream.write(byteArray);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}