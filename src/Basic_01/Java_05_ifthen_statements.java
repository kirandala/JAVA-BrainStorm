package Basic_01;

/**
 * @author kiran dalai
 *
 */
public class Java_05_ifthen_statements {
	/* The if-then statement is the most basic of all the control flow statements. if tells program to execute a certain section of code
	only if particular test evaluates to true 
	*/
	public static void main(String[] args) {
		
		boolean isbadboy =false;
		if(isbadboy==true) { 
			System.out.println("entered the code block 1 ");// code is not printed 
		}
			System.out.println("Enterd the code block 2");

// the above code also be written in the opposite manner like 
	if(isbadboy!=false) { 
		System.out.println("entered the code block 1 ");// code is not printed 
	}
	else { System.out.println("Enterd the code block 2 where == is used");}
// Trying to print with another statement in the else statement 	
	if(isbadboy!=false) { 
		System.out.println("entered the code block 1 where != is used");// code is not printed 
	}
	else { System.out.println("Enterd the code block 2 where != is used");}
	System.out.println("Entered out ");
	
	
// if we close the statement after the if statement it wont work coz we are ending the command without java deciding to run the code block
// If else statement should always be used with code block after if and else keywords .having code block will help to easy to understand.


}
}
