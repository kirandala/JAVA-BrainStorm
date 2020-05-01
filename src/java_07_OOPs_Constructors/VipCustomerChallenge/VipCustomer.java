package java_07_OOPs_Constructors.VipCustomerChallenge;

/**
 * @author kiran dalai
 *
 */
public class VipCustomer {

	private String Name;
	private double Creditlimit;
	private String email;
	
	public VipCustomer() { // 3
		this("kiran", 1000,"kiran@learn.com");
	}
	
	public VipCustomer(String name, double creditlimit) {  //2 

		this.Name = name;
		this.Creditlimit = creditlimit;
	}
	public VipCustomer(String name, double creditlimit, String email) {		 //1
		this.Name = name;
		this.Creditlimit = creditlimit;
		this.email = email;
	}
	public String getName() {
		return Name;
	}

	public double getCreditlimit() {
		return Creditlimit;
	}

	public String getEmail() {
		return email;
	}
	
	
}
