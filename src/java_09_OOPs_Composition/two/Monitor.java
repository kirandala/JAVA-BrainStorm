package java_09_OOPs_Composition.two;

import javax.print.attribute.ResolutionSyntax;

/**
 * @author kiran dalai
 *
 */
public class Monitor {
private String model;
private String manufacutrer;
private int size;
private Resolution nativeresolution;  // resolution is a component of monitor and i has new class 

public Monitor(String model, String manufacutrer, int size, Resolution nativeresolution) {
	this.model = model;
	this.manufacutrer = manufacutrer;
	this.size = size;
	this.nativeresolution = nativeresolution;
}
public void drawpixelat(int x,int y,String color) {
	System.out.println("drawing pixel at "+ x + ","+ y+ "in colour "+ color);
}

}
