package rpg;

public class Mage extends Heros {

	public Mage(String nom, Arme arme) {
		super(nom);
		super.setArme(arme);
		super.setAtk(getAtk()+10+arme.getAtkBonus());
		super.setDef(getDef()-2+arme.getDefBonus());
		super.setHp(getHp()-2+arme.getHpBonus());
	}

	public String toString() {
		return "(Wizard with "+super.getArme()+")"+super.toString();
	}
	
}
