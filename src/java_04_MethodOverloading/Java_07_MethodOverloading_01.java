package java_04_MethodOverloading;

/**
 * @author Kiran Dalai
 *
 */
public class Java_07_MethodOverloading_01 {

	/*
	 * Method overloading is the feature where the same method name can be used with
	 * different parameters Its the ability to create more implementations in same
	 * method
	 * 
	 * it improves code readability and re usability it is easier to remember one
	 * method name instead of multiple method names
	 * 
	 * its gives the flexibility to programmers so use same method with different
	 * data
	 * 
	 * Method overriding means defining a method in a child class that already
	 * exists in the parent class with same signature(same name, same arguments)
	 * 
	 * By extending the parent class the child class gets all the methods all the
	 * methods defined in the parent class(those methods are known as derived
	 * methods).
	 * 
	 * Method overriding is also known as Runtime polymorphism and Dynamic method
	 * dispatch , because the method that is going to be classed is decided at
	 * runtime by the jvm.
	 * 
	 * When we override a method it's recommended to put @override immediately above
	 * the method definition. this is an annotation that the compiler reads and will
	 * then shown us an error if we don't follow overriding rules correctly.
	 * 
	 * We can't override static methods only instance methods.
	 * 
	 * Method will be considered overridden if we follow these rules it must have
	 * same name and same arguments. Return type can be a subclass of the return
	 * type in the parent class. it can't have a lower access modifier. For example
	 * if the parent method is protected then using private in the child is not
	 * allowed but using public in the child would be allowed.
	 * 
	 * There are also some important points : Only inherited methods can be
	 * overridden, in other words methods can be overridden only in child classes.
	 * 
	 * Constructors and private methods cannot be overridden. methods that are final
	 * cannot be overridden A subclass can use super.methodname() to call the
	 * superclass version of an overridden method.
	 * 
	 *
	 */
	public static void main(String[] args) {
		System.out.println(caluculatescore("kiran", 10));
		System.out.println(caluculatescore(12));

	}

	public static int caluculatescore(String playername, int score) {
		System.out.println("Player name " + playername + " and  score is " + score);
		return score * 10;
	}

	public static int caluculatescore(int score) {
		System.out.println("Player Score is  " + score);
		return score * 10;
	}
}
