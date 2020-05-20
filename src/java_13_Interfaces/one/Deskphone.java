package java_13_Interfaces.one;

/**
 * @author kiran dalai
 *
 */
public class Deskphone implements ITelephone {

	private int mynumber;
	private boolean isringing;

	@Override
	public void poweron() {
		System.out.println("No action taken, Deskphone done not have a power button");
	}

	@Override
	public void dial(int phonenumber) {
		System.out.println("now ringing" + phonenumber + " on deskphone ");

	}

	@Override
	public void answer() {
		if (isringing) {
			System.out.println("Ansering the desk phone  ");
			isringing = false;
		}

	}

	@Override
	public boolean callphone(int phonenumber) {
		if (phonenumber == mynumber) {
			isringing = true;
			System.out.println(" Ring ring");
		}
		return false;
	}

	@Override
	public boolean isringing() {

		return isringing;
	}

	public Deskphone(int mynumber, boolean isringing) {
		this.mynumber = mynumber;
		this.isringing = isringing;
	}
	

}
