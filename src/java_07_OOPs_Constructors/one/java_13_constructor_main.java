package java_07_OOPs_Constructors.one;

/**
 * @author kiran dalai
 *
 */
public class java_13_constructor_main {

	  public static void main(String [] args) {
		  
		  Account_constructor myacc=new Account_constructor();
		  Account_constructor myacc1= new Account_constructor(100,"kiran","kiran@learn.com","00998678","12345");
		  System.out.println(myacc.getAccountBalance());
		  myacc.setAccountBalance(1000);
		  System.out.println(myacc.getAccountBalance());
		  
		  System.out.println(myacc1.getAccountBalance());
	  }


}
