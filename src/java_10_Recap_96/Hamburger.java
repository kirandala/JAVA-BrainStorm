package java_10_Recap_96;

/**
 * @author kiran dalai
 *
 */
public class Hamburger {

	private String name;
	private String meat;
	private double price;
	private String breadrolltype;

	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;

	public Hamburger(String name, String meat, double price, String breadrolltype) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadrolltype = breadrolltype;
	}

	public void addhamburgeraddon1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addhamburgeraddon2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addhamburgeraddon3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addhamburgeraddon4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double itemedhamburger() {
		double hamburgerprice = this.price;
		System.out
				.println(this.name + "Hamburger  on a " + this.breadrolltype + "roll price is " + hamburgerprice);
		if (this.addition1Name != null) {
			hamburgerprice += this.addition1Price;
			System.out.println(" added " + this.addition1Name + "for an extra " + this.addition1Price + "/n");
		}
		if (this.addition2Name != null) {
			hamburgerprice += this.addition1Price;
			System.out.println(" added " + this.addition2Name + "for an extra " + this.addition2Price + "/n");
		}
		if (this.addition3Name != null) {
			hamburgerprice += this.addition1Price;
			System.out.println(" added " + this.addition3Name + "for an extra " + this.addition1Price + "/n");
		}
		if (this.addition4Name != null) {
			hamburgerprice += this.addition1Price;
			System.out.println(" added " + this.addition4Name + "for an extra " + this.addition1Price + "/n");
		}
		return hamburgerprice;
	}
}
