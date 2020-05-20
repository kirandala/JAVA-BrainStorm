package java_09_OOPs_Enchapsulation.three;

/**
 * @author kiran dalai
 *
 */
public class Printer {

	private int tonerLevel;
	private int pagesprinted;
	private boolean duplex;

	public Printer(int tonerLever, boolean duplex) {
		if (tonerLevel >= 1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLever;
		}
		this.duplex = duplex;
		this.pagesprinted = 0;
	}

	public int addtoner(int toneramount) {
		if (toneramount > 0 && toneramount <= 100) {
			if (this.tonerLevel + toneramount > 100) {
				return -1;
			}
			this.tonerLevel += toneramount;
			return this.tonerLevel;
		} else
			return -1;
	}

	public int printpages(int pages) {
		int pagestoprint = pages;
		if (this.duplex) {
			pagestoprint = (pages / 2) + (pages % 2);
			System.out.println("printing in duplex mode");
		}
		this.pagesprinted += pagestoprint;
		return pagesprinted;
	}
	public int getPagesprinted() {
		return pagesprinted;
	}
}
