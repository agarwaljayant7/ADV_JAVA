package com.jayant.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jayant.crud.impl.CrudImpl;

public class Driver {
	
	private int  wrongChoiceCount = 0;
	private CrudImpl crudImpl = new CrudImpl();;
	
	public static void main(String[] args) {

		Driver driver = new Driver();
		BufferedReader bufferedReader = null;
		
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			getChoice(bufferedReader, driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getChoice(BufferedReader bufferedReader, Driver driver) throws IOException {
		int choice;
		while (true) {
			choice = displayMenu(bufferedReader, driver);

			switch (choice) {
			case 1:
//				System.out.println("Add");
				driver.crudImpl.create();
				break;
			case 2:
				System.out.println("Search");
				driver.crudImpl.read();
				break;
			case 3:
				System.out.println("Update");
				break;
			case 4:
				System.out.println("Delete");
				break;
			case 5:
				System.out.println("Thank you for using this application");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4|| choice == 6) {
				continue;
			}
			break;
		}
	}

	private static int displayMenu(BufferedReader bufferedReader, Driver driver) throws IOException {
		int choice = 0;
		
		System.out.println("1.ADD Employee\n2.SEARCH Employee\n3.UPDATE Employee\n4.DELETE Employee\n5.Exit");
		System.out.print("Enter your choice : ");
		try {
			choice = Integer.parseInt(bufferedReader.readLine());
		} catch (Exception e) {
			
			driver.wrongChoiceCount++;
			if (driver.wrongChoiceCount != 3) {
				System.out.println("Wrong Input, please try again");
				try {
					
				} catch (Exception e1) {
						e1.printStackTrace();
				}
			}
			System.out.println("Wrong input 3 times.. exiting");
			e.printStackTrace();
		}
		return choice;
	}

}
