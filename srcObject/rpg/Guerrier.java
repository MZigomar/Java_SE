package rpg;

public class Guerrier extends Heros {

	public Guerrier(String nom, Arme arme) {
		super(nom);
		super.setArme(arme);
		super.setAtk(getAtk()+arme.getAtkBonus());
		super.setDef(getDef()+5+arme.getDefBonus());
		super.setHp(getHp()+10+arme.getHpBonus());
	}


	public String toString() {
		return "(Warrior with "+super.getArme()+")"+super.toString();
	}
	
}
