package java_10_Arrays.arr01;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Arrayprogram {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myint = getIntegers(5);
		for (int i = 0; i < myint.length; i++) {
			System.out.println(" Element " + i + "typed value was " + myint[i]);
		}
		System.out.println(" the sum of the array is "+ getAvg(myint) );
	}

	public static int[] getIntegers(int number) {
		System.out.println(" Enter " + number + " integer value \r");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}

	public static double getAvg(int[] array) {
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum/array.length;

	}

}
