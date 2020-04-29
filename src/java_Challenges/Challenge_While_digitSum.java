package java_Challenges;

/**
 * @author kiran dalai
 *
 */
public class Challenge_While_digitSum {
	/*
	 * write a method with name with sumDigits that has one parameter int datatype
	 * called number of parameter is >=10 then the method should return the sum of
	 * all digits other wise return -1 which is invalid number if number is >10 the
	 * it should print the same digit also for negative numbers it should return -1
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("sum of digits in the number " + "is "+ sumDigits(125) );
		System.out.println("sum of digits in the number " + "is "+ sumDigits(12345) );
		System.out.println("sum of digits in the number " + "is "+ sumDigits(34768) );
	}

	private static int sumDigits(int number) {
		if(number < 10) {
			return -1;
			
		}
	 int sum=0; 
		while(number > 0 ) {
			// extract the last digit 
			int digit=number%10;
			sum +=digit;
			// remove the last digit 
			number /=10; // number = number/10 
		}
		return sum;
	}
}
