package java_07_OOPs.SuperVSsuperkeywords;

/**
 * @author kiran dalai
 *
 */
public class SuperCallgoodexample {
	/*
	 * in this example we have a class parent with x,y variables and class subclass
	 * that extends parent with variables weight and height
	 * 
	 * In subclass the 1st constructor we are calling the 2nd constructor
	 * 
	 * 2nd constructor calls the parent constructor with parameters x and y
	 * 
	 * the parent constructor will initialise x,y variables while the 2nd subclass
	 * constructor will initialise the width and height variables example
	 */

	private int x;
	private int y;

	public SuperCallgoodexample(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

class Rectanglesubclass extends SuperCallgoodexample {
	private int width;
	private int height;

	public Rectanglesubclass(int x, int y) {
		this(x, y, 0, 0); // calls 2nd constructor
	}

	public Rectanglesubclass(int x, int y, int width, int height) {
		super(x, y); // calls constructor from parent (super call good example)
		this.width = width;
		this.height = height;

	}
}