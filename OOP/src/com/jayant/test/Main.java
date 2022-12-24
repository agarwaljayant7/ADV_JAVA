package com.jayant.test;

public class Main {

	public static void main(String[] args) {

		
		BankAccount bankAccount1 = new BankAccount("Wonder Women", 1000);
		bankAccount1.withdraw(500);
		bankAccount1.deposit(5000);
		bankAccount1.withdraw(2000);
		
		System.out.println(bankAccount1.getOwner());
		System.out.println(bankAccount1.getBalance());
		
//		Employee employee1 = new Employee("Jayant", 31.9f, 3999.33f, Location.BANGALORE, "M.Tech");
//		Employee employee2 = new Employee("Jay", 28.7f, 3999.33f, Location.USA, "B.Tech");
//	
//		
//		System.out.println(employee1.getSalary());
//		System.out.println(employee2.getSalary());
//		employee1.raiseSalary(100.67f);
//		System.out.println(employee1.getSalary());
//		System.out.println(employee2.getSalary());
//		System.out.println(employee1.getOrganizationName());
//		System.out.println(employee2.getOrganizationName());
//		
//		Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
//		myFavoriteOakTree.announceTallTree();
//
//		Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
//
//		myFavoriteMapleTree.announceTallTree();
//		System.out.println(Tree.TRUNK_COLOR);
//		Tree.announceTree();
	}

}
