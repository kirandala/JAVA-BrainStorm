package java_13_Interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kiran dalai
 *
 */
public class Player implements ISaveable {
	private String name;
	private int hitpoints;
	private int Strength;
	private String weapon;

	public Player(String name, int hitpoints, int strength) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
		this.Strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "player {" + " name :" + name + " hit points " + hitpoints + " Strength" + Strength + "Weapons :"
				+ weapon;
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, "" + this.hitpoints);
		values.add(2, "" + this.Strength);
		values.add(3, "" + this.weapon);

		return values;
	}

	@Override
	public void read(List<String> savedvalues) {
		if(savedvalues != null && savedvalues.size()>0) {
			this.name=savedvalues.get(0);
			this.hitpoints=Integer.parseInt(savedvalues.get(1));
			this.Strength=Integer.parseInt(savedvalues.get(2));
			this.weapon=savedvalues.get(3);
		}

	}

}
