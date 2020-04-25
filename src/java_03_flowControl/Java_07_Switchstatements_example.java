/**
 * @author kirandalai
 */
package java_03_flowControl;

/**
 * @author kiran dalai
 *
 */
public class Java_07_Switchstatements_example {
	/*
	 * 
	 * Create a new switch statement using char create a new char variable create a
	 * switch statement testing for a b a c d or d display a message if any of these
	 * are found and then break Add a default which displays a message saying not
	 * found
	 */
	public static void main(String[] args) {

		char charvalue = 'A';
		switch (charvalue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found ");
			break;
		case 'C':
			System.out.println("c was found  ");
			break;
			default :
				System.out.println("didnt find anything listed.");
				break;
				
		}
	}

}
