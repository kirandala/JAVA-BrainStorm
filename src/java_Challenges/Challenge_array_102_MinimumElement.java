
package java_Challenges;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Challenge_array_102_MinimumElement {

	/**
	 * write a method called readintegers() with a parameter called count that
	 * represents how many integers that user need to enter
	 * 
	 * the method needs to read from the console untill all the numbers are enters
	 * and return an array containing the numbers entered.
	 * 
	 * Write a method findmin() with the array as a parameter. the method needs to
	 * return the minimum value in the array
	 * 
	 * in the main() method read the count from the console and call the method
	 * readIntegers() with the count parameter.
	 * 
	 * Then call the findmin() method passing the array returned form the call to
	 * the readintegers() method.
	 * 
	 * finally , print the minimum element in the array
	 * 
	 * tips: assume that the user will only enter numbers never letter. for
	 * simplicity , create a Scanner as a static field to help the data input
	 * 
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter count: ");
		int count = sc.nextInt();
		sc.nextLine();

		int[] returnedarray = readintegers(count);
		int returnedmin=findmin(returnedarray);
		
		System.out.println(" returned minimum value is "+ returnedmin);
	}

	private static int[] readintegers(int count) {
		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the number");
			int number = sc.nextInt();
			sc.nextLine();
			array[i] = number;
		}
		return array;
	}

	private static int findmin(int[] array) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value < min) {
				min = value;
			}

		}
		return min;
	}
}
