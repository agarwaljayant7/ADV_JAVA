
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRemote extends Remote{
	
	public String sayHello()throws RemoteException;
	
}
