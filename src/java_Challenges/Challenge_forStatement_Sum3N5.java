package java_Challenges;

/**
 * @author kiran dalai
 *
 */
public class Challenge_forStatement_Sum3N5 {
	/*
	 * Create a statement using a range of numbers from 1 to 1000 inclusive , Sum
	 * all the numbers that can be divided with 3 and also with 5 for those numbers
	 * that met the above conditions, print out the number break out the loop once
	 * you find 5 numbers that met the above conditions After breaking out of the
	 * loop print the sum of the numbers that met the above conditions
	 * 
	 */
	public static void main(String[] args) {
		int num = 0, count = 0;
		for (int i = 0; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				num = i + num;
				System.out.println("Valid numbers are " + i);
				count++;
				if (count == 5) {
					System.out.println("Breaking the statement at count =" + i);
					break;
				}
			}
		}
		System.out.println("Sum of 5 numbers divided by 3 or 5 is " + num);
	}

}
