package java_Challenges;

/**
 * @author kiran Dalai
 *
 */
public class Challenge_Method_1 {

	/*
	 * Create a method called displayhighscoreposition it should be a players name
	 * as a parameter, and 2nd parameter as a position in a high score table you
	 * should display the players name along with a message like
	 * "Managed to get the high position" Create a 2nd method called
	 * calculatehighscorepositon it should be sent on argument only , the player
	 * score it should return an int The return data should be 1 if the score is
	 * >1000 2 if the score is >500 and <1000 3 if the score is >100 and <500 4 if
	 * all other cases Call both methods and display the results of the following a
	 * score of 1500,900, 400,50
	 */
	public static void displayhighscoreposition(String playername, int postion) {
		System.out.println(playername);
		System.out.println("Managed to get the high position " + postion);
	}

	public static int calculatehighscorepositon(int score) {

		if (score > 1000) {
			return 1;
		} else if (score > 500 && score < 1000) {
			return 2;
		} else if (score > 100 && score < 500) {
			return 3;
		} else
			return 4;
	}

	public static void main(String[] args) {

		displayhighscoreposition("player1", 10);
		System.out.println(calculatehighscorepositon(1500));
		System.out.println(calculatehighscorepositon(900));
		System.out.println(calculatehighscorepositon(400));
		System.out.println(calculatehighscorepositon(50));
	}

}
