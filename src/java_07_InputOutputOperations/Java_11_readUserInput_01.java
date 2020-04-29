package java_07_InputOutputOperations;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Java_11_readUserInput_01 {

	/**
	 * Scanner is the class will help to serve our purpose
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Scanner is the class , new keyword will create a object for that class
		 * scanner or new instance is created System.in will allow to type the input
		 * from the console
		 */
		System.out.println("Enter the name ");
		String name = scanner.nextLine();
		// scanner.nextLine(); // handle next line character
		System.out.println("Enter the year of birth ");
		int birthyear = scanner.nextInt();
		int age = 2020 - birthyear;
		// after this we need to close the instance to release the memory
		scanner.close();
		System.out.println("Hello " + name);
		System.out.println("Age of " + name + " is " + age);
	}

}
