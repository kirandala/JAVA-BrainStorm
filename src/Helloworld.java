
public class Helloworld {

	public static void main(String args [] ) {
	// public is access modifier allows us to define the scope or how other parts of your code or even some else's code can access this code.
	// main() must be declared as public, it must be called by code outside of its class when program is started.
	// Static is used so that main() has to be called without instantiate a particular instance of the class.
	// void is used simply tells the compiler that main() does not return a value.
	// String args [] declares a paramenter named args, which is an array of instatnce of the class string here if args receives any command line args it executes.
		/* Main method should be always static because the main method will be called by the java virtual machine before any objects are created */
		
		System.out.println("Hello world");
		
	}
}
