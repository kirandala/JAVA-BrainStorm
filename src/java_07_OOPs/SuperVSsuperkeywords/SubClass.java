package java_07_OOPs.SuperVSsuperkeywords;

/**
 * @author kiran dalai
 *
 */
public class SubClass extends SuperClass {
	/*
	 * in java we have this() call and super() call. Notice the braces i is known as
	 * call Since it looks like a regular method call. use this() to call a
	 * constructor form another overloaded constructor in the same class
	 *
	 * the call to this() can be used only in a constructor, and it must be the
	 * first statement in the constructor. its used with constructor in other words
	 * when one constructor calls another constructor and helps to reduce duplicated
	 * code.
	 * 
	 * the only way to call a parent constuctor is by calling super(). this calls
	 * the parent constructor
	 * 
	 * The java complier puts a default call to super() if we dont add it, and it is
	 * always the no args super which is inserted by compiler(Constructor without
	 * argumments)
	 * 
	 * the call to super() must be the first statment in each constructor.
	 * 
	 * Evn abstract classes have constuctors, although you can never instantiate an abstract class using the new keyword.
	 * 
	 * An abstract class is still a super class, so its constructor run when some one makes an instance of a concrete subclass
	 * 
	 * Note: A constructor can have a call to usper() or this() but never both.
	 */
	@Override
	public void printMethod() {
		super.printMethod(); // calls the method in superclass (parent )
		System.out.println("Printed in subclasses");
	}

}
