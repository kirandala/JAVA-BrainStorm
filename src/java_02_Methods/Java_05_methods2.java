package java_02_Methods;

/**
 * @author kiran dalai
 *
 */
public class Java_05_methods2 {
	/*
	 * Method is a code block to pass some statements
	 * In programming world we usually return -1 if we wanted to tell its error or to track error in if else statements usually we use them
	 */
	public static void main(String[] args) {
		
// We can assign a value to an variable from the ouput of a method
		int result =caluculatebonus(100,10);
		System.out.println(" the method result is "+ result);
	}

	public static void caluculatescore() {
		int score = 400;
		if (score == 500)
			System.out.println("your score was 400 inside method"); // inside the block
		System.out.println("this was executed out inside method "); // not in block
	}

	public static void caluculatescore(int score) {

		if (score == 500)
			System.out.println("your score was 400 inside method"); // inside the block
		System.out.println("this was executed out inside method "); // not in block
	}

	public static int caluculatebonus(int score, int bonus)
	/*
	 * In this method instead of returning void where nothing will be returned we are
	   asking the method to return a int value here syntax will fail if the return
	   keyword with valid int value is not returned
	 */
	{
		int result = score + bonus;
		return bonus;

	}
}
