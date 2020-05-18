
package java_13_Interfaces.one;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/**
	 * lets take an example to understand where to use interfaces . lets take animal program dog and bird 
	 * so dog and bird both are animals so animal will be a super class to both dog and bird.
	 * but dog can walk but can't fly
	 * but bird can walk and fly .
	 * so we can have fly and walk as interfaces so 
	 * bird can extend animal class and implement fly and walk both
	 * dog and extend animal class and implement only walk class .. 
	 * 
	 * The basic idea is to use the multiple inheritance where ever applicable and to use interface there... 
	 */
	public static void main(String[] args) {
		ITelephone tel;
		tel=new Deskphone(124455652,true);
		tel.poweron();
		tel.callphone(13243516);
		tel.answer();
		
		tel=new Mobilephone(9876655,true);
		tel.callphone(9876655);
		tel.answer();
	}

}
