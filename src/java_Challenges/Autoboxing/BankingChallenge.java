
package java_Challenges.Autoboxing;

/**
 * @author kiran dalai
 *
 */
public class BankingChallenge {

	/**
	 * BankingChallenge:
	 * 
	 * Your job is to create a simple banking application there should be a bank
	 * class it should have an arraylist of branches Each branch Should have an
	 * arraylist of customers the customer class should have an arraylist of Doubles
	 * (transactions) customer: name and the Arraylist of doubles. branch: Need to
	 * be able to add a new customer and initial transaction amount. Also needs to
	 * add additional transactions for that customer/branch Bank: Add anew branch
	 * Add a customer to that branch with initial transaction Add a transaction for
	 * a existing customer for that branch Show a list of customers for a particular
	 * branch and optinally a list of their transactions
	 * 
	 * hit: transactions add data validation. eg. check if exits or doesn't not exit
	 * etc. Think about where you are adding the code to perform certain actions
	 * 
	 */
	public static void main(String[] args) {
		Bank bank = new Bank("SBI");

		bank.addbranch("Gajuwaka");
		bank.addcustomer("Gajuwaka", "kiran ", 10000.0);
		bank.addcustomer("Gajuwaka", "Honey ", 10000.0);
		bank.addcustomer("Gajuwaka", "Buddodu ", 2000.0);
		bank.addcutomerTransation("Gajuwaka", "kiran", 200.0);
		bank.addcutomerTransation("Gajwaka", "Buddodu", 300.0);

		bank.addbranch("NAD");
		bank.addcustomer("NAD", "deepu", 300);
		bank.addcustomer("NAD", "Honey", 400);
		bank.addcustomer("NAD", "Prasanth", 5000);
		bank.addcutomerTransation("NAD", "Honey", 200);
		bank.addcutomerTransation("NAD", "Prasanth", 300);

		bank.listcustomer("Gajuwaka", false);
		bank.listcustomer("NAD", false);

	}
}
