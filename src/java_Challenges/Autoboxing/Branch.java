package java_Challenges.Autoboxing;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Branch {
	private String branchname;
	private ArrayList<Customer> customer;

	public Branch(String branchname) {
		this.branchname = branchname;
		this.customer = new ArrayList<Customer>();
	}

	public String getName() {
		return branchname;
	}

	public boolean newCustomer(String customername, double intialAmount) {
		if (findCustomer(customername) == null) {
			this.customer.add(new Customer(customername, intialAmount));
		}
		return false;
	}

	public boolean addCustomerTransactions(String customerName, double amount) {
		Customer existingcustomer = findCustomer(customerName);

		if (findCustomer(customerName) != null) {
			existingcustomer.addTransactions(amount);
			return true;
		}
		return false;
	}

	private Customer findCustomer(String customername) {
		for (int i = 0; i < this.customer.size(); i++) {
			Customer checkedcustomer = this.customer.get(i);
			if (checkedcustomer.getName().equals(customername)) {
				return this.customer.get(i);
			}
		}
		return null;
	}

	public String getBranchname() {
		return branchname;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}

}
