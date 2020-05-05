package java_07_OOPs.SuperVSsuperkeywords;

/**
 * @author kiran dalai
 *
 */
public class Thiscallgoodexample {
// by default we call any constructor the same 3rd constructor will be called . 
	// here we are performing constructor chaining and there by we avoid code duplication
	
	private int x;
	private int y;
	private int width;
	private int height;

	public Thiscallgoodexample() {
	this(0, 0); // calls second constructor here 
	}

	public Thiscallgoodexample(int width, int height) {
		this(0,0,width,height);// calls the third constructor 
	}

	public Thiscallgoodexample(int x, int y, int width, int height) {
		this.x = x;  
		this.y = y;
		this.width = width;
		this.height = height;
	}

}
