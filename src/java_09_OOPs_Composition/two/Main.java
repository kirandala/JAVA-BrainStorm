package java_09_OOPs_Composition.two;

import java.awt.event.WindowStateListener;

/**
 * @author kiran dalai
 *
 */
public class Main {

	// We are trying to hide few features of using compostion now to enhance the use of composition  
	public static void main(String[] args) {
		Dimensions dimen = new Dimensions(10, 10, 10);
		Case thecase = new Case("2020", "apple", "wired", dimen);
		Monitor themon = new Monitor("2020", "Apple", 42, new Resolution(25, 25)); // we are creating a instance of
																					// Resolution class without using
																					// reference variable
		Motherboard mb = new Motherboard(" 2019", "Intel", 2, 2, "windows");
		PC thepc = new PC(thecase, themon, mb);
//		thepc.getMonitor().drawpixelat(1500, 2000, "red");   These becomes invalid since we have made the getters private 
//		thepc.getMb().loadprogram("windows 10");
//		thepc.getThecase().getPowersupply();
		thepc.powerup();
	}

}
