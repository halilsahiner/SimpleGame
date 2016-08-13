package Game;

	public class Bow extends Weapon implements Upgradable{
		
		private int numArrows;
		
		public Bow(double price, double weight, double damage, int numArrows){
			super(price, weight, damage);
			if(numArrows>0){
				this.numArrows = numArrows;
			}
			if(numArrows<=0){
				numArrows = 0;
			}
			
			
		}

		public int getNumArrows() {
			return numArrows;
		}

		@Override
		public boolean useItem() {
			if(numArrows>0){
				numArrows-=1;
				System.out.println("The Bow is used to throw an arrow and caused damage of "+this.getDamageAmount()+" points.");
				return true;
			}
			return false;
		}
		
		@Override
		public void upgrade() {
			// TODO Auto-generated method stub
			
			numArrows+=10;
		}

		@Override
		public String toString() {
			return "Bow [numArrows=" + numArrows + ", getDamageAmount()=" + getDamageAmount() + ", getItemPrice()="
					+ getItemPrice() + ", getItemWeight()=" + getItemWeight() + "]";
		}
		
	}


