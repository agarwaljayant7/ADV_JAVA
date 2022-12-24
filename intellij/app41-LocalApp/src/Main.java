import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
      try{
          Socket socket = new Socket("localhost", 4444);
          OutputStream outputStream = socket.getOutputStream();
          PrintStream printStream = new PrintStream(outputStream);

          BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
          String data = bufferedReader1.readLine();

          printStream.println(data);

          InputStream inputStream2 = socket.getInputStream();
          BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2));

          String data2 = bufferedReader2.readLine();
          System.out.println(data2);

      }
      catch(Exception e){
          e.printStackTrace();
      }
    }
}