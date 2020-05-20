package java_07_OOPs_Constructors.overloading;

/**
 * @author kiran dalai
 *
 */
public class Account_constructor {

	/**
	 * we can initialize the class with some data automatically lets take example
	 * from account where some default value has to be stored in the class
	 * 
	 */

	private double accountBalance;
	private String custoername;
	private String customeremail;
	private String customerphonenumber;
	private String accountNumber;

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustoername() {
		return custoername;
	}

	public void setCustoername(String custoername) {
		this.custoername = custoername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomerphonenumber() {
		return customerphonenumber;
	}

	public void setCustomerphonenumber(String customerphonenumber) {
		this.customerphonenumber = customerphonenumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account_constructor(double accountBalance, String custoername, String customeremail,
			String cusotmerphonenumber, String accountNumber) {

		this.accountBalance = accountBalance;
		this.custoername = custoername;
		this.customeremail = customeremail;
		this.customerphonenumber = cusotmerphonenumber;
	}

	// We can call the above constructor using a default constructor by
	public Account_constructor() { // this the syntax to create a constructor however java will create the default
		// Constructor automatically
		this(1234, "kiran ","kiran@learn.com","909087","12345");// we are calling the above constructors we have created
		System.out.println("Empty constructor called");
	}
	
//SHORTCUTS:
	/*WE CAN CREATE CONSTRUCTORS WITH IDE'S HELP BY CLICKING ON source>generate getters and setters
	 * also we can create constructors with generate constructors option on the source menu 
	 */
}
