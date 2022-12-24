import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try{
            File file = new File("C:/Users/Jayant/Desktop/docs/welcome.txt");
            System.out.println(file.isFile());
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.getName());
            System.out.println(file.getParent());
            System.out.println(file.getAbsolutePath());

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Durga Software Solution".getBytes());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}