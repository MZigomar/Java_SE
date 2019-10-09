package rpg;
import java.util.*; 

public class Heros {
	
	private final int stats = 40;
	
	private String nom;
	
	private int hp;
	private int atk;
	private int def;

	private boolean dead;
	
	private Arme arme;
	
	public Heros (String nom) {
		dead = false;
		Random r1 = new Random();
		atk = r1.nextInt(6)+5;
		def = atk/2+2;
		hp = stats - atk - def;
		
		this.nom = nom;
	}

	//METHOD
	public void Attaquer(Heros cible) {
		if(cible.getDef() >= this.getAtk() ) {
			System.out.println("The attack deals no damage.\n");
			return;
		}
		System.out.println(this.nom+" hits "+cible.getNom()+" and deals "+(this.getAtk() - cible.getDef()+" damages !\n"));
		cible.setHp(cible.getHp() - (this.getAtk() - cible.getDef())) ;
		
		if(cible.getHp()<=0) {
			System.out.println(cible.getNom()+ " is dead...\nBATTLE ENDEND_____________\n");
			cible.die();
		}
		
	}
	
	public boolean isAlive() {return !this.dead;}
	private void die() {this.dead = true;}

	//GETTER SETTER
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}

	public int getAtk() {return atk;}
	public void setAtk(int atk) {this.atk = atk;}

	public int getDef() {return def;}
	public void setDef(int def) {this.def = def;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	public Arme getArme() {return arme;}
	public void setArme(Arme arme) {this.arme = arme;}


	//TOSTRING
	public String toString() {
		return this.nom+" : "+this.hp+" HP"+"\nAtk : "+this.atk+"\nDef : "+this.def+"\n";
	}
}
