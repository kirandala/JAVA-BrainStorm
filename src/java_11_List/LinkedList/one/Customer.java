package java_11_List.LinkedList.one;

/**
 * @author kiran dalai
 *
 */
public class Customer {

	// this class is to demstrate how will Arraylist take time to execute a piece of
	// code when an element is added in the middle
	private String name;
	private double balance;

	public Customer(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
