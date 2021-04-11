/**
 * @author kiran dalai
 */
package Java_15_Generics.one;
/*
When you want to use a collection like List or Set, 
you declare the type of the contained elements by placing their class name in angle brackets.

List<String> strings = new ArrayList();
Set<Employee> employees = new HashSet();
Declaring the data type of the collection accomplishes two goals:

You can’t accidentally place the wrong type inside a collection

You no longer need to cast a retrieved value to the proper type
*/

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {

		ArrayList items = new ArrayList();
		items.add(0);
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		// items.add("name"); // when this is uncommented then we get exception "cant
		// cast string to integer"
		items.add(5);

		printDoubled(items);
	}

	public static void printDoubled(ArrayList e) {
		for (Object i : e) {
			System.out.println((Integer) i * 2);
		}

	}
}
