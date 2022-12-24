package com.durgasoft.app24.test;

class B{
	
	public  void m1() {
		
	}
}
class A extends B{
	
	@Override
	public void m1(){
		
	}
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		 A a = new A();
		 a.getB();
		 
	}
}