package java_09_OOPs_Composition.two;

/**
 * @author kirandalai
 *
 */
public class Motherboard {

	private String model;
	private String manufacture;
	private int ramslots;
	private int cardslots;
	private String bios;

	public Motherboard(String model, String manufacture, int ramslots, int cardslots, String bios) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.ramslots = ramslots;
		this.cardslots = cardslots;
		this.bios = bios;
	}

	public void loadprogram(String programname) {
		System.out.println("Program " + programname + " is now loading");
	}

	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public int getRamslots() {
		return ramslots;
	}

	public int getCardslots() {
		return cardslots;
	}

	public String getBios() {
		return bios;
	}

}
