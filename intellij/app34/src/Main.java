import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("C:/Users/Jayant/Desktop/docs/welcome.txt")){
            String data = "";
            int val = fileReader.read();
            while(val != -1){
                data = data + (char) val;
                val = fileReader.read();
                Thread thread = new Thread();

            }
            System.out.println(data);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}