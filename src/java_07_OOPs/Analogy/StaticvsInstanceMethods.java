package java_07_OOPs.Analogy;

/**
 * @author kirandalai
 *
 */
public class StaticvsInstanceMethods {

	/**
	 * Static methods are declared using a static modifier
	 *
	 * Static methods Cant's access instance methods and instance variables directly
	 *
	 * They are usualy user for operation that dont require any data from an
	 * instance of the class(from this)
	 *
	 * the this keyword is the current instance of the class so, we cant use this
	 * keyword.
	 *
	 * Whenever you see a method that does not use instance variables that method
	 * should be declared as static method.
	 *
	 * for example main is a static method and it is called by jvm when it starts an
	 * application .
	 *
	 * Static methods are classed as ClassName.methodname() or methodname() is in
	 * the same class.
	 *
	 *Instance methods:
	 *
	 *Instance methods belong to an instance of a class.
	 *To use an instance method we have to instantiate the class first usually by using the new keyword.
	 *
	 *Instance methods can access instance methods and instance variables directly.
	 *Instance methods can also access static methods and static variables directly.
	 *
	 *     should a method be static?
	 *     			|
	 *     does it use any fields(instance variables) or instance methods
	 *     if yes{    it should probably be an instance method.}
	 *     if no{ if should probably be a static method}
	 *     
	 */
	
	// instance method 
	
	public void bark() {
		System.out.println("Woof");
	}
	public static void main(String[] args) {  // static method
		// to access that instance method we need to create an instance of that class with the new keyword
		StaticvsInstanceMethods sv=new StaticvsInstanceMethods(); // create instance 
		sv.bark(); // call instance method 
	}

}
