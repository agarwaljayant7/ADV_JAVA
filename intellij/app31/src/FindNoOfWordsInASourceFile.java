import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindNoOfWordsInASourceFile {

    public static void main(String[] args) throws IOException {

//        String fileName = args[0];
        String file = "C:/Users/Jayant/Desktop/Resume update.txt";

        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bt = new byte[fileInputStream.available()];

        fileInputStream.read(bt);

        String data = new String(bt);

        int count = 0;
        String token = "";
        String[] tokens = data.split(" ");
        for(String tempToken : tokens){
//            System.out.println(token);
            if(tempToken.contains("Jayant")){
//                System.out.println(token);
                token = tempToken;
                count++;
            }
        }
        System.out.println("Token: " + token + "is repeating" + count + "times");
    }
}
