package java_07_OOPs.SuperVSsuperkeywords;

/**
 * @author kiran dalai
 */
public class Java_13_this {

	/**
	 * super and this keywords
	 * 
	 * super keyword is used to all the current class members (variables and is
	 * required when we have a parameter with same name as an instance
	 * variable(field)
	 * 
	 * Note: we Can use both of them anywhere a class except static areas(Static
	 * block or static method) . Any attempt to do so will lead to compile- time
	 * errors
	 * 
	 * "this" keyword is commonly used with constructors and setters, and optionally
	 * in getters ( easier for beginners).
	 * 
	 * keyword super is commonly used with method overriding , when we call a method
	 * with the same name form the parent class. In the example below we have a
	 * method printMethod that calls super.printMethod.
	 */

// We are using the this keyword in the constructors and setters since there is a parameter with the same name .
//	we don't have any promenades so the this keyword is optional.
	private String color;

	public Java_13_this(String color) {
		this.color = color;
	}

	public String color() {
		return color;
	}

	public void setcolor(String colour) {
		this.color = colour;
	}
}
