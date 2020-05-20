package java_07_InputOutputOperations;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Challenge_scanner_read$ {

	/**
	 * Read 10 numbers from the console enters by the user and print the sum of
	 * those numbers. create a Scanner and use the hassnextin method form the
	 * scanner to check if user has entered an int value if hasnexin returns false,
	 * print message "invalid Number ". continue reading until you have read 10
	 * numbers use nextint method an add to the sum.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		while (true) {
			int order = counter + 1;
			System.out.println("Enter number " + order + ":");
			boolean isanInt = scanner.hasNextInt();
			if (isanInt) {
				int number =scanner.nextInt();	
				counter ++;
				sum += number;
				if(counter==10) {
					break;
				}
			} else {
				System.out.println("Invalid number");
			}
			scanner.nextLine(); // handle end of line
		}
		scanner.close();
		System.out.println("Sum = "+ sum);
	}

}
