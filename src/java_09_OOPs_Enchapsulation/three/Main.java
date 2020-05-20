package java_09_OOPs_Enchapsulation.three;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/*
	 * Create a class and demonstrate proper encapsulation techniques the class will
	 * be called printer it will simulate a real computer printer it should have
	 * fields for the toner lever, number of pages printed, and also whether its a
	 * duplex printer(capable of printing on both sided of the paper) also whether
	 * to fill up the toner (up to a maximum of 100%), another method to simulate
	 * printing a page (which should increase the number of pages printed). Decide
	 * on the scope , whether to use constructors and anything else you think is
	 * needed.
	 */
	public static void main(String[] args) {

		Printer printer = new Printer(50, true);
		System.out.println("intial page count =" + printer.getPagesprinted());
		int pagesprinted = printer.printpages(4);
		System.out.println(
				"pages printed was " + pagesprinted + " New total print count for printer =" + printer.getPagesprinted());
		pagesprinted= printer.printpages(5);
		System.out.println(
				"pages printed was " + pagesprinted + " New total print count for printer =" + printer.getPagesprinted());
		
	}
}
