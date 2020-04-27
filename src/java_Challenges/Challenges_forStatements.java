package java_Challenges;

/**
 * @author kiran dalai
 *
 */
public class Challenges_forStatements {

	/**
	 * To print if the entered number is prime or not 
	 * 
	 *if the entered number is prime then print it out and increment a count of the number of prime number found.
	 *if that count is 3 exit the for loop 
	 *hint: use the break; statement to exit the for loop.
	 */
	public static void main(String[] args) {
		System.out.println(isPrime(4));
		System.out.println(isPrime(20));
		System.out.println(isPrime(13));
		// to fetch the count of prime numbers 
		int count =0;
		for(int i=0;i<50;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number"+ i+ " is prime number");
				if(count==3) {
					System.out.println("Exiting the loop ");
					break;
				}
			}
		}

	}

	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
