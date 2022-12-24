
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote{

	

	public HelloRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Hello User";
	}
	

}
