package java_Challenges.Autoboxing;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class Bank {
	private String name;
	private ArrayList<Branch> branch;

	public Bank(String name) {
		this.name = name;
		this.branch = new ArrayList<Branch>();
	}

	public boolean addbranch(String branchName) {
		if (findbranch(branchName) == null) {
			this.branch.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addcustomer(String branchname, String customername, double intialamount) {
		Branch branch = findbranch(branchname);
		if (branch != null) {
			return branch.newCustomer(customername, intialamount);
		}
		return false;
	}

	public boolean addcutomerTransation(String branchname, String customername, double amount) {
		Branch branch = findbranch(branchname);
		if (branch != null) {
			return branch.addCustomerTransactions(customername, amount);
		}
		return false;
	}

	private Branch findbranch(String branchname) {
		for (int i = 0; i < this.branch.size(); i++) {
			Branch checkedbranch = this.branch.get(i);
			if (checkedbranch.getName().equals(branchname)) {
				return checkedbranch;
			}

		}
		return null;
	}

	public boolean listcustomer(String branchname, boolean showtranctions) {
		Branch branch = findbranch(branchname);
		if (branch != null) {
			System.out.println("Customer details for branch" + branch.getName());

			ArrayList<Customer> branchcustomers = branch.getCustomer();
			for (int i = 0; i < branchcustomers.size(); i++) {
				Customer branchcustomer = branchcustomers.get(i);
				System.out.println("customer" + branchcustomer.getName() + " [" + (i + 1) + "]");
				if (showtranctions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchcustomer.getTransaction();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[" + (j + 1) + " ] Amount " + transactions.get(j));
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
