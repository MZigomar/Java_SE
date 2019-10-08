package rpg;

public class Guerrier extends Heros {

	public Guerrier(String nom) {
		super(nom);
		super.setDef(getDef()+2);
		super.setHp(getHp()+4);
	}

	public String toString() {
		return "(Guerrier)"+super.toString();
	}
	
}
