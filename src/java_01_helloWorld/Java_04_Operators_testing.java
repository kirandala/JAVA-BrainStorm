package java_01_helloWorld;

/**
 * @author kiran dalai
 *
 */
public class Java_04_Operators_testing {
	/*
	 * problem : Create a double variable with value 20 create second variable with
	 * double value 80.00 add both numbers and multiply by 100 use the remainder
	 * operator to figure out what the remainder for the result of the operation in
	 * steps 3 and 40.00 . create a boolean variable that assigns the value true if
	 * the remainder is #4 is 0, or false if its not zero. output the boolean
	 * variable write as if-the statement that displays a message
	 * "got some remainder" if the boolean in step 5 is not true.
	 */
	public static void main(String[] args) {
		double firstVal = 20.00;
		double secondVal = 80.00;
		double myValtotal = firstVal + secondVal * 100.00d;
		// first second* 100 is getting ran first because of operator precedence if
		// works when double myValtotal=(firstVal+secondVal) *100.00d;
		double remainder = myValtotal % 40.00d;
		System.out.println("the remainder is " + remainder);
		boolean isNotremainder = (remainder == 0) ? true : false;
		System.out.println(" the value of isnot remainder is " + isNotremainder);
		if (!isNotremainder)
			System.out.println(" has got some remainder ");

	}

}
