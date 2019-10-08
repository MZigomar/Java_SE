package rpg;
import java.util.*; 

public class Heros {

	private int hp;
	private int atk;
	private int def;
	
	private String nom;
	
	private final int stats = 20;
	
	public Heros (String nom) {
		Random r1 = new Random();
		atk = r1.nextInt(4)+2;
		def = atk/2+1;
		hp = stats - atk - def;
		
		this.nom = nom;
	}
	
	//METHOD
	public void Attaquer(Heros cible) {
		if(cible.getDef() >= this.getAtk() ) {
			System.out.println("L'attaque n'inflige aucun d�g�t\n");
			return;
		}
		System.out.println(this.nom+" attaque "+cible.getNom()+" et inflige "+(this.getAtk() - cible.getDef()+" d�gats !\n"));
		cible.setHp(cible.getHp() - (this.getAtk() - cible.getDef())) ;
		
	}
	
	//GETTER SETTER
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}

	public int getAtk() {return atk;}
	public void setAtk(int atk) {this.atk = atk;}

	public int getDef() {return def;}
	public void setDef(int def) {this.def = def;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	//TOSTRING
	public String toString() {
		return this.nom+" : "+this.hp+" HP"+"\nAtk : "+this.atk+"\nDef : "+this.def+"\n";
	}
}