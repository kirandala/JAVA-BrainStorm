package java_03_flowControl;

/**
 * @author kiran dalai
 *
 */
public class Java_09_WhileStatements {
	/*
	 * When we don't know the number of iteration needed for any piece of code to
	 * run we use While loop In for loop we do know the range like int=0 and i<=10
	 * here we know the range it starts from 0 and ends at 10 but when while loop is
	 * considered we only give the condition when it has to be executed.
	 * 
	 * The while loop checks the condition at the start before executing the block
	 * with the do while loop the code block is executed at once and then the
	 * condition is checked There are more chances of entering into endless loops so
	 * always check your condition/ expressions
	 * 
	 * We can interrupt the loop by using a continue or break statements With the
	 * continue keyword the loop will bypass the part of code block that is below
	 * the continue keyword we can exit the loop depending on the condition that we
	 * are checking
	 */
	public static void main(String[] args) {
		int count = 5;
		while (count != 10) { // this code block will run until the condition is met and once the condition
								// becomes false it quits
			System.out.println("Count vlaues is " + count);
			count++;
		}

		// Lets write anothor loop to understand the loop properly again
		count = 1;
		while (true) {
			if (count == 5) {
				break;
			}
			System.out.println("count in new is " + count);
			count++;
		}
		// if we wanted to execute the code at least once and then continue to break if
		// the initial condition itself is met.
		// lets explore how to use do while loop
		// Do while statement code will run at lease once into the do loop
		count = 1;
		do {
			System.out.println("count values was " + count);
			count++;
		} while (count != 6);
	}
}
