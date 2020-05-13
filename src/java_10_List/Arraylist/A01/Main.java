
package java_10_List.Arraylist.A01;

import java.util.Scanner;

/**
 * @author kiran dalai
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static Grocerry gr = new Grocerry();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printinstruction();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.hasNextLine();

			switch (choice) {
			case 0:
				printinstruction();
				break;
			case 1:
				gr.printgro();
				break;
			case 2:
				additem();
				break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
			case 5:
				searchforitem();
				break;
			case 6:
				quit = true;
				break;
			}

		}

	}

	public static void printinstruction() {
		System.out.println("\n press ");
		System.out.println("\t 0- To print choice items");
		System.out.println("\t 1- To print the list of grocerry items ");
		System.out.println("\t 2- To add an item to the list ");
		System.out.println("\t 3- To modify an item in the list");
		System.out.println("\t 4- To remove an item from the list");
		System.out.println("\t 5- To search for an item in the list");
		System.out.println("\t 6- To quit the application");

	}

	public static void additem() {
		System.out.println("please enter the item: ");
		sc.nextLine();
		gr.addgro(sc.nextLine()); // we are accessing the addgro method from grocerry class and taking the scanner
									// input
	}

	public static void modifyitem() {
		System.out.println("Enter the item number");
		sc.nextLine();
		int itemno = sc.nextInt();
		sc.hasNextLine();
		System.out.println("Enter replacement item");
		sc.nextLine();
		String newitem = sc.nextLine();
		gr.modifygorcerryitem(itemno - 1, newitem); // we are giving itemno-1 so that the array usually counts from zero

	}

	public static void removeitem() {
		System.out.println("Enter the item number");
		sc.nextLine();
		int itemno = sc.nextInt();
		sc.hasNextLine();
		gr.removegrocerryitem(itemno-1);
	}

	public static void searchforitem() {
		System.out.println("Item to search for :");
		sc.nextLine();
		String searchitem = sc.nextLine();
		if (gr.finditem(searchitem) != null) {
			System.out.println("found " + searchitem + "in our grocerry store");
		} else
			System.out.println("Item not found");
	}
}
