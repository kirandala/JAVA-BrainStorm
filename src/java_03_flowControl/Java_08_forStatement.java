package java_03_flowControl;

/**
 * @author kiran dalai
 *
 */
public class Java_08_forStatement {
	/*
	 * Syntax would be for(init, termination; increment){ } using the for statment ,
	 * call the caluculatedInterest method with amount of 10000 with interest rate
	 * from 1 to 9 and print the interest on console
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("10000 at 2% interest = " + calculateinterest(10000, 2));

		for (int i = 0; i < 5; i++) {
			System.out.println(" loop " + i + " printed ");
		}
		for (int i = 1; i < 9; i++) {
			System.out.println(calculateinterest(10000, i) + " is the interest amount if interest rate is " + i);
			// we can get rid of the .000000 which are printing so this can be achehivied by
			System.out.println(String.format("%.2f", calculateinterest(10000, i))
					+ " is the interest amount if interest rate is " + i + " in formated way");
		}

		// To print the interest values from 9 to 2 can be acehived by
		for (int i = 8; i > 2; i--) {
			System.out.println(String.format("%.2f", calculateinterest(10000, i))
					+ " is the interest amount if interest rate is " + i + " in formated way");
		}
	}

	private static double calculateinterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
