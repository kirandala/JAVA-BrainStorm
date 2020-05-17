
package java_11_List.LinkedList.one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placestovist = new LinkedList<String>();
		placestovist.add("SydneY");
		placestovist.add("hyderabad");
		placestovist.add("Melborne");
		placestovist.add("Chennai");
		placestovist.add("Bangalore");
		placestovist.add("Indore");
		placestovist.add("Delhi");
		printlist(placestovist);

		// now adding another element in place 2
		placestovist.add(2, "Demart");
		printlist(placestovist);

		// remove element in position 1
		placestovist.remove(4);
		printlist(placestovist); // Hyderabad is removed

		// added new method
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		LinkedList<String> placestovist1 = new LinkedList<String>();
		addinorder(placestovist1, "Delhi");
		addinorder(placestovist1, "bombay");
		addinorder(placestovist1, "vizag");
		addinorder(placestovist1, "hyd");
		addinorder(placestovist1, "madras");
		addinorder(placestovist1, "chennai");
		addinorder(placestovist1, "nodia");

		printlist(placestovist1);
		// adding a new cities and adding duplicate
		addinorder(placestovist1, "nodia");
		addinorder(placestovist1, "Dhavan");
		printlist(placestovist1);

		visit(placestovist1);

	}

	private static void printlist(LinkedList<String> linkedlist) {
		Iterator<String> it = linkedlist.iterator();
		while (it.hasNext()) {
			System.out.println(" now visiting " + it.next());
		}
		System.out.println("********************");
	}

	private static boolean addinorder(LinkedList<String> linkedlist, String newcity) {
		ListIterator<String> Stringlistiterator = linkedlist.listIterator();
		while (Stringlistiterator.hasNext()) {
			int comparision = Stringlistiterator.next().compareTo(newcity);
			if (comparision == 0) {
				// if equal then already the city is available
				System.out.println(newcity + " is already included as a destination ");
				return false;
			} else if (comparision > 0) {
				// new city should appear before this one
				Stringlistiterator.previous();
				Stringlistiterator.add(newcity);
				return true;
			} else if (comparision < 0) {
				// move to the next city

			}
		}
		Stringlistiterator.add(newcity);
		return true;
	}

	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingforward = true; // to track the travering movement so we dont fall in infinite loops when list
										// iterator dont have a trace of which is previous and which is next if worked
										// like this
		ListIterator<String> listite = cities.listIterator();

		if (cities.getFirst() == "") {
			System.out.println(" no cities in the entered");
			return;
		} else {
			System.out.println("Now visiting" + listite.next());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Holiday (Vacation) is over");
				quit = true;
				break;
			case 1:
				if (!goingforward) { // this is to make sure that the pointer is not lost when we are traversing to
										// previous element.
					if (listite.hasNext()) {
						listite.next();
					}
					goingforward = true;
				}
				if (listite.hasNext()) {
					System.out.println("Now visiting " + listite.next());
				} else {
					System.out.println("Reached the end of list");
					goingforward = false;
				}
				break;
			case 2:
				if (goingforward) {
					if (listite.hasPrevious()) {
						listite.previous();
					}
					goingforward = false;

				}
				if (listite.hasPrevious()) {
					System.out.println("Now visiting " + listite.previous());
				} else {
					System.out.println("we are at the start of the list");
					goingforward = true;

				}
				break;
			case 3:
				printMenu();
				break;
			}

		}

	}

	private static void printMenu() {
		System.out.println("Available actions: \n");
		System.out
				.println("0- to quit \n" + "1- go to next city \n" + "2- go to previous city \n" + "3- print menu \n");

	}
}
