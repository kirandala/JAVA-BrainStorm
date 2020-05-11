package java_10_Recap_96;

/**
 * @author kiran dalai
 *
 */
public class HealthyBurger extends Hamburger {
	private String healthyextra1name;
	private double healthyextra1price;

	private String healthyextra2name;
	private double healthyextra2price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye"); // we already know the bread and name so hardcoding themhere
	}

	public void addhealtyaddon1(String name, double price) {
		this.healthyextra1name = name;
		this.healthyextra1price = price;
	}

	public void addhealtyaddon2(String name, double price) {
		this.healthyextra2name = name;
		this.healthyextra2price = price;
	}

	@Override
	public double itemedhamburger() {
		double healthburgerprice=super.itemedhamburger();
		if(this.healthyextra1name != null) {
			healthburgerprice += this.healthyextra1price;
		}
		if(this.healthyextra2name != null) {
			healthburgerprice += this.healthyextra2price;
		}
		
		return healthburgerprice;
	}
	

}
