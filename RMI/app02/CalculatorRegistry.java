import java.rmi.*;
public class CalculatorRegistry{
	public static void main(String[] args){
	
		CalculatorRemote calculatorRemote = new CalculatorRemoteImpl();
		Naming.bind("cal", calculatorRemote);
		System.out.println("Calculator Remote bounded with Cal logical name in RMI registry");
	}

}