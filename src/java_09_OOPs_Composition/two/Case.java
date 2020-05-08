package java_09_OOPs_Composition.two;

/**
 * @author kiran dalai
 *
 */
public class Case {

	private String model;
	private String manufaturer;
	private String powersupply;
	private Dimensions dimen;
	public Case(String model, String manufaturer, String powersupply, Dimensions dimen) {

		this.model = model;
		this.manufaturer = manufaturer;
		this.powersupply = powersupply;
		this.dimen = dimen;
	}
	
	public void presspowerbutton() {
		System.out.println("power button pressed");
	}
	public String getModel() {
		return model;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public String getPowersupply() {
		return powersupply;
	}
	public Dimensions getDimen() {
		return dimen;
	}
	
	
	
}
