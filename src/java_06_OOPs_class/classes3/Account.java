package java_06_OOPs_class.classes3;

/**
 * @author kiran dalai
 *
 */
public class Account {
	
	private double accountBalance;
	private String custoername;
	private String customeremail;
	private String customerphonenumber;
	private String accountNumber;
	
	public void deposit(double depositamout) {
		this.accountBalance += depositamout;
		System.out.println("Money is deposited ");
	}
	public void withdrawal(double withdrawalamout) {
		if(this.accountBalance-withdrawalamout < 0) {
			System.out.println(" Only "+ this.accountBalance+ "available . Withdrawal not processed");
		}
		else {
			this.accountBalance -=withdrawalamout;
			System.out.println(" withdraws of "+ withdrawalamout+ "Remaining balance is "+ this.accountBalance);
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

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
	


}
