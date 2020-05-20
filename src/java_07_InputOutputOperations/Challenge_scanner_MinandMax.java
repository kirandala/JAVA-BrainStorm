package java_07_InputOutputOperations;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Challenge_scanner_MinandMax {

	/**
	 * Read the numbers from the console entered by the user and print the minimum
	 * an maximum number that user has entered if the user enters any invalid number
	 * , break out of the loop and print the minimum and maximum numbers
	 * 
	 * 
	 * we can also use by changing the values of min and max to max and min value
	 * possible by int instead of 0 initially without using the boolean flag
	 *  like : int min =Integer.MIN_VALUE; and int max = Integer.MAX_VALUE
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 0;
		boolean first = true;

		while (true) {
			System.out.println("Enter the Number :");
			boolean isanInt = scanner.hasNextInt();
			if (isanInt) {
				int number = scanner.nextInt();
				if (first) { // we are making the code to enter and assign the value to min and max

					first = false; // since we wanted to run only once we are assigning back as false so loop wont
									// execute after first time
					min = number;
					max = number;
				}
				if (number > max) {
					max = number;
				}

				if (number < min) {
					min = number;
				}

			} else {
				break;

			}

			scanner.nextLine();
		}
		scanner.close();
		System.out.println("Min is " + min + " max is " + max);
		System.out.println("End of program");
	}

}
