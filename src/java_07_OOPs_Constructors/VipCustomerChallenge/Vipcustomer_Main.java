
package java_07_OOPs_Constructors.VipCustomerChallenge;

/**
 * @author kiran dalai
 *
 */
public class Vipcustomer_Main {

	/**
	 * Create a class VipCustomer
	 * it should have 3 fields name,credit limit and email address.
	 * create 3 constructors empty should call the constructor with 3 parameters with default values 
	 * 2nd constructors should pass on the 2 values it receives and add a default value for the 3rd constructor should save al fields.
	 * create getters only for this using code generations . test and confirm if it works.
	 */
	public static void main(String[] args) {
		VipCustomer person1=new VipCustomer(); // default 
		System.out.println("person name is "+ person1.getName());
		System.out.println("person limt is "+ person1.getCreditlimit());
		
		VipCustomer person2=new VipCustomer("person2 ",900); // second constructor where 2 parameters are called
		System.out.println("person name is "+ person2.getName());
		System.out.println("person limt is "+ person2.getCreditlimit());
		
		VipCustomer person3=new VipCustomer("person 3",9098,"per3@kiran.com");// assigning values constructor 3 parameters
		System.out.println("person name is "+ person3.getName());
		System.out.println("person limt is "+ person3.getCreditlimit());
	}

}
