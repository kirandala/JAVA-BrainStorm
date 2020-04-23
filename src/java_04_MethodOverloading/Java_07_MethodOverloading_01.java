package java_04_MethodOverloading;

/**
 * @author Kiran Dalai
 *
 */
public class Java_07_MethodOverloading_01 {

	/*
	 * Method overloading is the feature where the same method name can be used with
	 * different parameters
	 * Its the ability to create more implementations in same method 
	 * 
	 * it improves code readability and re usability 
	 * it is easier to remember one method name instead of multiple method names 
	 * 
	 * its gives the flexibility to programmers so use same method with different data 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(caluculatescore("kiran",10));
		System.out.println(caluculatescore(12));

	}

	public static int caluculatescore(String playername, int score) {
		System.out.println("Player name " + playername + " and  score is " + score);
		return score * 10;
	}
	public static int caluculatescore(int score) {
		System.out.println("Player Score is  " +score);
		return score * 10;
	}
}
