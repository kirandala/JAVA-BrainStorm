package Basic_01;
/**
 * @author kirandalai
 *
 */
public class Helloworld {

	public static void main(String args [] ) {
	// public _ (access modifier) allows us to define the scope or how other parts of your code or even some else's code can access this code.
	// main() must be declared as public, it must be called by code outside of its class when program is started.
	// Static is used so that main() has to be called without instantiate a particular instance of the class.
	// void is used simply tells the compiler that main() does not return a value.
	// String args [] declares a parameter named args, which is an array of instance of the class string here if args receives any command line args it executes.
		/* Main method should be always static because the main method will be called by the java virtual machine before any objects are created */
		
		System.out.println("Hello world");
		
	}
}


/* 
  Method:collection of statements that performs a task
 Main method is used for which java looks for and this is the entry point of the program
 
{ }- code block : used to define a bloc of code and its mandatory to have one in a mnethod declaration 

Java Keywords are case sensitive and every statement ends with ; semi colon 
and statement can include one or more expressions, this is the command that has to be executed.
Java will execute each line between the semi colons 

Java Package is the way to organize your java projects. Companies use their domain names reversed.





*/