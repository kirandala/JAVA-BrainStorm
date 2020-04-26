package java_03_flowControl;

/**
 * @author kirandalai
 *
 */
public class Java_09_continueBreak {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int number = 0;
		while (number < 15) {
			number++;
			if (number <= 5) {
				System.out.println(" skipped numbers are " + number);
				continue;
				// here after this step the control will move back to the while
				// condition(number<15) and then starts fresh again
			}
			System.out.println("Numbers are " + number);
			if (number >= 10) {
				System.out.println("Breaking at " + number);
				break;  // code will exit and go back  } } then again code continues 
			}
		}

	}

}
