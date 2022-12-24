package com.jayant.app01.test;

import com.jayant.app01.entities.I;
import com.jayant.app01.entities.ImplClass;

public class TestInterf {

	public static void main(String[] args) {

		I i = new ImplClass();
		i.m1();
		i.m2();
		
		System.out.println(I.a);
		System.out.println(i.a);
		System.out.println(ImplClass.a);
		
		System.out.println();
		
		ImplClass c = new ImplClass();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.a);
		
		
	}

}
