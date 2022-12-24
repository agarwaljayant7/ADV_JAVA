import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {

	public static void main(String[] args) {
	
		ServerSocket serverSocket = new ServerSocket(4444);
		Socket socket = serverSocket.accept();
	InputStream inputStream1 = socket.getInputStream();
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream1));
	
	String data1 = bufferedReader.readLine();
	System.out.println(data1);
	
	OutputStream outputStream = socket.getOutputStream();
	PrintStream printStream = new PrintStream(outputStream);
	
	BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
	String data2 = bufferedReader2.readLine();
	printStream.println(data2);
	
	}

}
