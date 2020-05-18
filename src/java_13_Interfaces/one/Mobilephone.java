package java_13_Interfaces.one;

/**
 * @author kiran dalai
 *
 */
public class Mobilephone implements ITelephone{
	private int mynumber;
	private boolean isringing;
	private boolean ison= false;

	@Override
	public void poweron() {
		ison=true;
		System.out.println("Mobile is powered up");
	}

	@Override
	public void dial(int phonenumber) {
		if(ison) {
			System.out.println("now ringing" + phonenumber + " on mobile phone ");
		}
		else {
			System.out.println("phone is switched off");
		}
		
	}

	@Override
	public void answer() {
		if (isringing) {
			System.out.println("Ansering the mobile phone  ");
			isringing = false;
		}

	}

	@Override
	public boolean callphone(int phonenumber) {
		if ((phonenumber == mynumber) && ison) {
			isringing = true;
			System.out.println(" Melody ring");
		}
		else {
			isringing  = false;
			System.out.println("Mobile phone not on or number different");
		}
		return false;
	}

	@Override
	public boolean isringing() {

		return isringing;
	}

	public Mobilephone(int mynumber, boolean isringing) {
		this.mynumber = mynumber;
		this.isringing = isringing;
	}
}
