import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        try(
                FileInputStream fileInputStream =
                new
                FileInputStream
                ("C:/Users/Jayant/Desktop/Resume update.txt");
                ){
            int size = fileInputStream.available();
            byte[] bt = new byte[size];
            fileInputStream.read(bt);
            String data = new String(bt);
            System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}