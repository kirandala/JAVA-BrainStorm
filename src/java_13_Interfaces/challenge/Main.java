package java_13_Interfaces.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/**
	 * Create a Interface (Tips: name it Saveable or ISaveabe) Interface allows an
	 * object to be saved to some sort of storage medium. Tip use arraylist The
	 * exact type of medium is not known to the interface( nor to the classes that
	 * implements it). The interface will just specify 2 methods, Want to return an
	 * arraylist of values to be saved Order to populate the objects feel from the
	 * Arraylist.(parameter)
	 * 
	 * Create a Few sample Classes that implement your Saveable interface (we've use
	 * the idea of a game, with players and Monsters , but you can create any type
	 * of classes that you want).
	 * 
	 * Override the toString() method for each of your classes so that they can be
	 * easily printed to enable the program to be tested earlier
	 * 
	 * In main, write a method that takes an object that implements the interface as
	 * a parameter and "saves" the values eg. calls the method defined in the
	 * interface.
	 * 
	 * your method should just print the vlaues to the screen. also in the Main
	 * class write a method that restores the values to a Saveable object eg. calls
	 * the method from the interface for populating fields.
	 * 
	 * user readvalues() method below to simulate getting values from a file. This
	 * allows you to type as many values as your class required and returns and
	 * Arraylist.
	 * 
	 *
	 */
	public static void main(String[] args) {
		Player tim = new Player("tim", 100, 15);
		System.out.println(tim.toString());
		saveobject(tim);

		tim.setHitpoints(9);
		System.out.println(tim);
		tim.setWeapon("gun");
		saveobject(tim);
		loadobject(tim);
		System.out.println(tim);

		ISaveable wolf = new Monster("narnia", 200, 20);
		System.out.println("strenth :" + ((Monster) wolf).getStrength()); // we are actually adding a cast to identify
																			// the class we wanted to get the method
																			// from
		saveobject(wolf);

	}

	public static ArrayList<String> readvalues() {

		ArrayList<String> values = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println(" choose \n" + "1 - to enter a string \n" + " 0 to quit ");

		while (!quit) {
			System.out.println(" Choose an option ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter a string");
				String stringinput = sc.nextLine();
				values.add(index, stringinput);
				index++;
				break;
			}
		}
		return values;
	}

	public static void saveobject(ISaveable objecttosave) {
		for (int i = 0; i < objecttosave.write().size(); i++) {
			System.out.println("Saving " + objecttosave.write().get(i) + "to Storage device");
		}
	}

	public static void loadobject(ISaveable objecttoload) {
		ArrayList<String> values = readvalues();
		objecttoload.read(values);
	}
}
