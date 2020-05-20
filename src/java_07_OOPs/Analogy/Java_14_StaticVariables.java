package java_07_OOPs.Analogy;

/**
 * @author kiran dalai
 *
 */

public class Java_14_StaticVariables{
	private static String name;

	public Java_14_StaticVariables(String name) {
		Java_14_StaticVariables.name = name;
	}

	public void printname() {
		System.out.println("Name is " + name);
	}

	/**
	 * Static variables declared by keyword static
	 * 
	 * Static variables are also known as static member variables.
	 * 
	 * Every instance of that class shares the same static variables.
	 * 
	 * if changes made to that variables, all other instances will see the effect of
	 * the change.
	 * 
	 * static variables are not used very often but can sometimes be very useful
	 * 
	 * For example when reading user input using scanner we will declare scanner as
	 * a static variable. there by all static methods can access that scanner
	 * directly
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Java_14_StaticVariables rex = new Java_14_StaticVariables("rex "); // created instance rex
		Java_14_StaticVariables fluffy= new Java_14_StaticVariables("fluffy"); // created instance
																									// fluffy
		rex.printname(); // prints fluffy
		fluffy.printname(); // prints fluffy.

		// this is because when we changed the static variable name using the
		// constructor and both the instances are sharing the variables fluffy is
		// printed twice.

	}

}
