package rpg;

public enum Arme {

	Sword(3,3,0),	
	Staff(5,1,0);



	private int atkBonus;
	private int defBonus;
	private int hpBonus;
	
	//CONSTRUCTOR
	Arme(int atkBonus, int defBonus, int hpBonus) {
		this.atkBonus = atkBonus;
		this.defBonus = defBonus;
		this.hpBonus = hpBonus;
	}
	
	public int getAtkBonus() {return atkBonus;}
	public int getDefBonus() {return defBonus;}
	public int getHpBonus() {return hpBonus;}
	
}
