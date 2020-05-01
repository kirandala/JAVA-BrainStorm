
package java_06_OOPs_class.classes3;

/**
 * @author kiran dalai
 *
 */
public class java_13_classes_main {
	/*
	 * Create new class for a bank account create fields for the account number,
	 * balance,customer name, email and phone number
	 * 
	 * create getters and setters for each field create tow additional methods 1. to
	 * allow the customer to deposit funds (this should increment the balance field)
	 * 2. to allow the customer to withdraw finds this should deduct form the
	 * balance field but not allow the withdrawal to complete if there are
	 * insufficient funds you will want to create various code in the Main class to
	 * confirm your code is working and some system.out.println in the two methods
	 * above as well
	 */
	public static void main(String[] args) {

		Account kiranaccount = new Account();
		kiranaccount.withdrawal(100);
		kiranaccount.deposit(1000);
		System.out.println(kiranaccount.getAccountBalance()); // double value is available hence has to print the value
		kiranaccount.withdrawal(100);
		kiranaccount.setAccountBalance(10000); // we are assinging the value 
		System.out.println(kiranaccount.getAccountBalance());

	}
}
