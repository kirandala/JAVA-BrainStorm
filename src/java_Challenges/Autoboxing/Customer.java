package java_Challenges.Autoboxing;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Customer {
	private String name;
	private ArrayList<Double> transaction;

	
	public Customer(String name, double initialAmount) {
		this.name = name;
	}

	public void addTransactions(double amount) {
		this.transaction.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransaction() {
		return transaction;
	}

}
