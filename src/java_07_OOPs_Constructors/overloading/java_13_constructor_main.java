package java_07_OOPs_Constructors.overloading;

/**
 * @author kiran dalai
 *
 */
public class java_13_constructor_main {

	public static void main(String[] args) {

		Account_constructor myacc = new Account_constructor(12000, "tim ", "kiran1@learn.com", "909087235", "123456");
		System.out.println(" my account balance is " + myacc.getAccountBalance());
		System.out.println(" my account name is " + myacc.getCustoername());
		System.out.println(" my account email is " + myacc.getCustomeremail());
		System.out.println(" my account phonenumber is " + myacc.getCustomerphonenumber());

	}

}
