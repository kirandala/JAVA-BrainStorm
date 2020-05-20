package java_09_OOPs_Composition.three;

/**
 * @author kiran dalai
 *
 */
public class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilts;
	public Bed(String style, int pillows, int height, int sheets, int quilts) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilts = quilts;
	}
	public void make() {
		System.out.println(" in the bed class and make method making ");
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilts() {
		return quilts;
	}
	
	
}
