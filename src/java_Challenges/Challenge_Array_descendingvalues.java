package java_Challenges;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Challenge_Array_descendingvalues {

	/**
	 * Create a program using arrays that sorts a list of integers in descending
	 * order. Descending order is highest value to lowest. In other words if the
	 * array had the values in 106, 26 81,5,15 program should give back an array 5
	 * 15 26,81,106
	 * 
	 * set up the program so that the number to sort are read in from the keyboard
	 * Implement the following methods- getIntegers, printArray and sortIntegers
	 * getIntegers returns an array of entered integers from keywords
	 * 
	 * print array prints out the contents of the array
	 * 
	 * and sort integers should sort the array and return a new array contain in the
	 * sorted numbers
	 * 
	 * you will have to figure out how to copy the array elements from the passed
	 * array into a new array and sort them and return the new sorted array.
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myint = getintegers(5);
		sortIntegers(myint);
		printArray(sortIntegers(myint));
	}

	public static int[] getintegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + "integer values \r");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + "Contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedarray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedarray[i] = array[i];
		}
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedarray.length-1; i++) {
				if (sortedarray[i] < sortedarray[i + 1]) {
					temp = sortedarray[i];
					sortedarray[i] = sortedarray[i + 1];
					sortedarray[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("sorted array is ");
		for(int i : sortedarray) System.out.println(i); 
		return sortedarray;

	}
}
