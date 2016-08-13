package Game;

public class Armor extends Item implements Upgradable {
	private double defencePoints;
	private boolean isWorn;

	public Armor(double price, double weight, double defencePoints) {
		super(price, weight);
		// TODO Auto-generated constructor stub
		isWorn = false;
		if (defencePoints > 0) {
			this.defencePoints = defencePoints;
		}
		if (defencePoints <= 0) {
			defencePoints = 0.0;
		}
	}

	public boolean useItem() {
		this.isWorn=true;
		return true;
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public double getHit(double damagePoints) {
		if (isWorn) {
			if (defencePoints >= damagePoints) {
				defencePoints -= damagePoints;
				return 0;
			} else {
				defencePoints = 0.0;
				return damagePoints -= this.defencePoints;
				
			}

		} 
	
		else{
		return damagePoints;
		}

	}

	@Override
	public String toString() {
		return "\nArmor price: " + this.getItemPrice() + "\nWeight: " + this.getItemWeight()
		+ "\nDefence point: " + this.defencePoints + "\n";
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub

		defencePoints += 100;
	}

}
