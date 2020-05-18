package java_14_InnerClass.one;

import java.util.ArrayList;

/**
 * @author kiran dalai
 *
 */
public class GearBox {
	private ArrayList<Gear> gears;
	private int maxgears;
	private int Currentgear = 0;
	private boolean clutchin;

	public GearBox(int maxgears) {
		this.maxgears = maxgears;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
	}

	public void operateclutch(boolean in) {
		this.clutchin = in;
	}

	public void addGear(int number, double ratio) {
		if ((number > 0) && (number <= maxgears)) {
			this.gears.add(new Gear(number, ratio));
		}
	}

	public void changeGear(int newgear) {
		if(( newgear>=0) && (newgear < this.gears.size() && this.clutchin)) {
			this.Currentgear=newgear;
			System.out.println("Gear "+this.Currentgear+"is selected");
		}
		else {
			System.out.println(" Grind ");
			this.Currentgear=0;
		}
	}
	public double wheelspeed(int revs) {
		
		if(clutchin) {
		 System.out.println("Screem!!");
		 return 0.0;
		}
		else return revs+gears.get(Currentgear).getRatio();
		
	}
		
		
		
		

	private class Gear { // inner class
		private int gearnumber;
		private double ratio;

		public Gear(int gearnumber, double ratio) {
			this.gearnumber = gearnumber; // this gearnumber is referenced to the gear class instance not the outer
											// class instance if we wanted to access the gearbox class intance we need
											// to use gearbox.gearnumber so we can access the instance of outer class
			this.ratio = ratio;

		}

		public double drivespeed(int revs) {
			return revs * (this.ratio);
		}

		public int getGearnumber() {
			return gearnumber;
		}

		public double getRatio() {
			return ratio;
		}
		
	}

}
