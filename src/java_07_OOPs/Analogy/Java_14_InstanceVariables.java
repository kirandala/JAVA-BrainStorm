package java_07_OOPs.Analogy;

/**
 * @author kirandalai
 *
 */
public class Java_14_InstanceVariables {

	/**
	 * instance variables dont use static keyword
	 * 
	 * Instance variables are also known as fields or member variables
	 * 
	 * Instance variables belong to instance of a class.
	 * 
	 * Every instance has its own copy of an instance variable
	 * 
	 * Every instance can have different value (state).
	 * 
	 * Instance  variables represent the state of an instance. 
	 * 
	 */
	
	private String name;
	public Java_14_InstanceVariables(String name) {
		this.name=name;   // since its not static variable it can be called using this keyword
	}
	public void printname() {
		System.out.println("Name is "+ name);
	}
	public static void main(String[] args) {
		Java_14_InstanceVariables rex = new Java_14_InstanceVariables("rex");  // created instance rex
		Java_14_InstanceVariables fluffy= new Java_14_InstanceVariables("fluffy"); // create instance fluffy
		rex.printname();  // prints rex
		fluffy.printname();  // prints fluffy

	}

}
