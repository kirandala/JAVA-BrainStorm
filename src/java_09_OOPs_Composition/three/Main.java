package java_09_OOPs_Composition.three;

/**
 * @author kiran dalai
 *
 */
public class Main {

	/*
	 * Create a single room of a house using composition think about the things that
	 * should be included in the room May be physical parts of the house but
	 * furniture as well Add at at least one method to access an object via getter
	 * and then that objects public methods
	 * 
	 * then add at least one method to hide the object but to access the object used
	 * in composition within the main class
	 */
	public static void main(String[] args) {
		Wall wall1 = new Wall("west");
		Wall wall2 = new Wall("east");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");

		Ceiling cl = new Ceiling(11, "green");
		Bed bed = new Bed("kingmodular", 2, 3, 1, 1);
		Lamp lamp = new Lamp("classic", false, 5);
		Bedroom bedroom = new Bedroom("kiran", wall1, wall2, wall3, wall4, cl, bed, lamp);
		bedroom.makebed();

		bedroom.getLamp().turnon();
	}

}
