package java_09_OOPs_Composition.three;

/**
 * @author kirandalai
 *
 */
public class Lamp {
private String style;
private boolean battery;
private int globerating;
public Lamp(String style, boolean battery, int globerating) {

	this.style = style;
	this.battery = battery;
	this.globerating = globerating;
}
public void turnon() {
	System.out.println("Lamp --> turing on in lamp class turn on method");
}
public String getStyle() {
	return style;
}
public boolean isBattery() {
	return battery;
}
public int getGloberating() {
	return globerating;
}


}
