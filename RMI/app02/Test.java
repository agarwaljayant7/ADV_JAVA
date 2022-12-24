import java.rmi.*;
class Test{

	public static void main(String[] args){
	
		CalculatorRemote calRemote = (CalculatorRemote)Naming.lookup("cal");
		System.out.println("Add  : " + calRemote.add(10, 5));
		System.out.println("Sub  : " + calRemote.sub(10, 5));
		System.out.println("Mul  : " + calRemote.mul(10, 5));
		
		
	}

}