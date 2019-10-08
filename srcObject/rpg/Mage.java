package rpg;

public class Mage extends Heros {

	public Mage(String nom) {
		super(nom);
		super.setAtk(getAtk()+10);
		super.setHp(getHp()-2);
		super.setDef(getDef()-2);
	}

	public String toString() {
		return "(Mage)"+super.toString();
	}
	
}
