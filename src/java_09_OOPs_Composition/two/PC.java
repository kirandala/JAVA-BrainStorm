package java_09_OOPs_Composition.two;

/**
 * @author kiran dalai
 *
 */
public class PC {

	private Case thecase;
	private Monitor monitor;
	private Motherboard mb;
	public PC(Case thecase, Monitor monitor, Motherboard mb) {
		this.thecase = thecase;
		this.monitor = monitor;
		this.mb = mb;
	}
	public void powerup() {   // created a new method to call in the pc class 
		thecase.presspowerbutton();  // accessing them directly 
		drawlogo();
	}
	private void drawlogo() {
		monitor.drawpixelat(100, 200, "yellow"); // accessing them direclty
	}

	
	
}
