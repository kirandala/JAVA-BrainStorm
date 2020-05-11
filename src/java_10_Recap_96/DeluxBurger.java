package java_10_Recap_96;

/**
 * @author kiran dalai
 *
 */
public class DeluxBurger extends Hamburger{

	public DeluxBurger() {
		super("Delux", "pork", 300, "white");
		super.addhamburgeraddon1("chips", 40);
		super.addhamburgeraddon2("coke", 30);
	}

	@Override
	public void addhamburgeraddon1(String name, double price) {

		System.out.println("cannot add another item");
	}

	@Override
	public void addhamburgeraddon2(String name, double price) {
		System.out.println("cannot add another item");
	}

	@Override
	public void addhamburgeraddon3(String name, double price) {
		System.out.println("cannot add another item");
	}

	@Override
	public void addhamburgeraddon4(String name, double price) {
		System.out.println("cannot add another item");;
	}

	// to prevent them from working 
	
	

}
