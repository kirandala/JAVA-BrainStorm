package java_05_Strings;

/**
 * @author kiran dalai
 *
 */
public class Java_10_parsingStrings {

	/**
	 * Converting String to another datatype
	 * 
	 */
	public static void main(String[] args) {

		String numberAsString = "2018";

		System.out.println("number as String is " + numberAsString);

		int number = Integer.parseInt(numberAsString); // parse int will convert that string to Interger
		System.out.println("Number = " + number);
		number++;// we are incrementing value of 1
		numberAsString += 1; // Number as string after adding 120181
		System.out.println("Number added 1 " + number);
		System.out.println("Number as string after adding 1" + numberAsString);

		String numberAsString1 = "2018a";
		int number2 = Integer.parseInt(numberAsString1); // and exception should be printed
															// java.lang.NumberFormatException.forInputString
		
		// We can also work with other data types like double
		double doublenum=Double.parseDouble(numberAsString);
		System.out.println("Parse double value is "+ doublenum);
		
		// we can use for long and other data types as well
		
		
		
	}

}
