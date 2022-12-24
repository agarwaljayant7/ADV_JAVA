import java.rmi.Naming;


public class Main {

	public static void main(String[] args)throws Exception {

		HelloRemote helloRemote = (HelloRemote) Naming.lookup("hello");
		System.out.println(helloRemote.sayHello());
	}

}
