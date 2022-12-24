import java.rmi.*;
import java.rmi.server.*;
public class CalculatorRemoteImpl extends UnicastRemoteObject implements CalculatorRemote{

	public CalculatorRemoteImpl() throws RemoteException{
		
		
	}
	
	public int add(int fval, int sval)throws RemoteException{
			return fval + sval;
	}
		
	public int sub(int fval, int sval)throws RemoteException{
		return fval - sval;
	}
	public int mul(int fval, int sval)throws RemoteException{
		return fval * sval;
	}

}