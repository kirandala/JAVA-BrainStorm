package java_Challenges;

/**
 * @author kiran dalai
 *
 */
public class Challenge_whileloop_evenchecker {
	/*
	 * Create a method call ieEventNumber that takes a parameter of type int its
	 * purpose it to determine if the argument passed to the method is and even
	 * number or not return ture if an even number otherwise return false
	 * 
	 * modify the while code and make it also record the total number of even number
	 * ith as found break once 5 are found display the total number of even numbers
	 * found
	 */
	public static void main(String[] args) {
		// checking a range of number by this way
		int number = 4;
		int finalnum = 20;
		int evnenumbersfound = 0;
		while (number <= finalnum) {
			number++;
			if (!isEvenNumber(number)) {
				continue; // this continue will skip from execution if remaining statements and go back to check the condition 
			}
			evnenumbersfound++;
			System.out.println("Even number" + number);
		}
		System.out.println("Total number of even numbers found are " + evnenumbersfound);
		// if we wanted to exit after 5 mbers are
		number = 4;
		finalnum = 20;
		evnenumbersfound = 0;
		while (number <= finalnum) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number" + number);
			evnenumbersfound++;
			if (evnenumbersfound == 5)
				break;
			
		}
		System.out.println("Total number of even numbers found are " + evnenumbersfound);

	}

	public static boolean isEvenNumber(int num) {
		if ((num % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
