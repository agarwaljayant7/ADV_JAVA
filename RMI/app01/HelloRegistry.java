
import java.rmi.Naming;

public class HelloRegistry {

	public static void main(String[] args) throws Exception{

		HelloRemote helloRemote = new HelloRemoteImpl();
		Naming.bind("hello", helloRemote);
		System.out.println("Hello Remote Object binded with hello logical name in RMIRegisty");
		
		
	}

}
