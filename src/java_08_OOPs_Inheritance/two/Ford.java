package java_08_OOPs_Inheritance.two;

/**
 * @author kiran dalai
 *
 */
public class Ford extends Car{

	private int service;
	
	public Ford(int service) {
		super("ford", "4 wheel drive ", 4, 4, 5, true);
		this.service = service;
	}
	public void accelerate(int rate) {
		int newvelocity=getCurrentvelocity() + rate;
		if(newvelocity==0) {
			stop();
			setCurrentgear(1);
		}
		else if(newvelocity > 0 && newvelocity <=10) {
			setCurrentgear(1);
		}
		else if( newvelocity >10 && newvelocity <=20) {
			setCurrentgear(2);
		}
		else if( newvelocity >20 && newvelocity <=30) {
			setCurrentgear(3);
		}
		else { 
			setCurrentgear(4);
		}
		
		if(newvelocity > 0) {
			changevelocity(newvelocity,getCurrentdirection());
		}
	}
	
	
}
