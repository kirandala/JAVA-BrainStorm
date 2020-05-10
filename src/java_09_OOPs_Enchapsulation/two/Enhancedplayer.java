/**
 * @author kirandalai
 */
package java_09_OOPs_Enchapsulation.two;

/**
 * @author kiran dalai
 *
 */
public class Enhancedplayer {
	public String name;
	public int health;
	public String weapon;

	public Enhancedplayer(String name, int health, String weapon) {
		super();
		this.name = name;
		if (health > 0 && health <= 200) {  // we are adding a condition to validate if health is proper
			this.health = health;
		}
		this.weapon = weapon;
	}
	public void losshealth(int damage) {
		this.health=this.health-damage;
		if(this.health<=0) {
			System.out.println("Player knocket out");
		}
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getWeapon() {
		return weapon;
	}
	
}
