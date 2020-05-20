package java_07_OOPs.SuperVSsuperkeywords;

/**
 * @author kiran dalai
 *
 */
public class Thiscallbadexample {
// this way of declaring constructors is considered a very bad programming 
	// it has duplicate code all the three constuctors are initilizing variables 
	private int x;
	private int y;
	private int width;
	private int height;

	public Thiscallbadexample() {
		this.x = 0;
		this.y = 0;
		this.height = 0;
		this.width = 0;
	}

	public Thiscallbadexample(int x, int y) {
		this.x = x;
		this.y = y;
		this.height = 0;
		this.width = 0;
	}

	public Thiscallbadexample(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

}
