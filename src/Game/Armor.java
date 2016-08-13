package Game;

public class Armor extends Item implements Upgradable{
	private double defencePoints ;
	private boolean isWorn;
	
	public Armor(double price, double weight, double defencePoints) {
		super(price, weight);
		// TODO Auto-generated constructor stub
		isWorn=false;
		if (defencePoints>0){
			this.defencePoints=defencePoints;
		}
		if (defencePoints<=0){
			defencePoints=0.0;
		}
	}



	
	public boolean useItem(){
		return isWorn;
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean isWorn() {
		return isWorn;
	}
	public double getHit(double damagePoints){
	if(isWorn){	
		if(defencePoints>=damagePoints){
			defencePoints-=damagePoints;
			return 0;
		}
		if(defencePoints<damagePoints){
			defencePoints=0.0;
			damagePoints-=defencePoints;
		}
	
	
	
	}
	return damagePoints;
	}




	@Override
	public String toString() {
		return "\nArmor Defence Points" + defencePoints + "\nArmor Price" + getItemPrice() + "\nArmor Weight"
				+ getItemWeight() ;
	}




	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		
		defencePoints+=100;
	}

	




}
