import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try(
                FileWriter fileWriter = new FileWriter("C:/Users/Jayant/Desktop/docs/welcome.txt", false);
                ){
            String data = new String("Java Training@Durgasoft");
            char[] charArray = data.toCharArray();
            fileWriter.write(charArray);
            System.out.println("data transferred to C:/Users/Jayant/Desktop/docs/welcome.txt");
        }
        catch (Exception exception){
            exception.toString();
        }
    }
}