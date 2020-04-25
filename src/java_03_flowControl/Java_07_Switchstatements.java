package java_03_flowControl;

/**
 * @author kiran dalai
 *
 */
public class Java_07_Switchstatements {
	/*
	 * 
	 * */
	public static void main(String[] args) {
		int value = 3;
		if (value == 1) {
			System.out.println("value was 1");
		} else if (value == 2) {

			System.out.println("Values was 2");
		} else {
			System.out.println("value is 3");
		}
		// Instead of writing this case we can make use of the switch statment which
		// will make our life easy
		int switchval = 5;
		switch (switchval) {
		case 1:
			System.out.println("values is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		case 3:
			System.out.println("Value is 3");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("value is among 4 5 or 6");
			break;
		// if the break statement is missing it will continue to the next line of cade
		// as well so never forget the break statement.
		// if break statement is missing it will continue till the next break statement
		// is displayed.
		default:
			System.out.println(" none was listed");
			break; // this is not required however its a good practice to add the break
		}

	}

}
