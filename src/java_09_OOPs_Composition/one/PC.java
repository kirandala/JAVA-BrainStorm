package java_09_OOPs_Composition.one;

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
	public Case getThecase() {
		return thecase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public Motherboard getMb() {
		return mb;
	}
	
	
}
