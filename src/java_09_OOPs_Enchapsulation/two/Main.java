package java_09_OOPs_Enchapsulation.two;

/**
 * @author kiran dalai
 *
 */
public class Main {
	/*
	 * Encapsulation is the mechanism in which you restrict the access to certain
	 * components in an object so we are able to protect the members of the class
	 *
	 * even if the variable names are changed in the enhancedplayer class the values
	 * we can try by renaming the health to hitpoint in enhacedplayer class dont
	 * change here
	 * 
	 * We are not having any values defendant on the enahncedplayer class instead we
	 * are declaring the values here itself in the main method and in the object
	 * player.
	 * 
	 */
	public static void main(String[] args) {
		Enhancedplayer player = new Enhancedplayer("Kiran", 40, "gun"); // if we change the value here it should reflect
																		// in the console output
		System.out.println("Initial health is " + player.getHealth());

	}
}
