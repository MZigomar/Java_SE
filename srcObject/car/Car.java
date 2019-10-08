package car;
import java.io.Serializable;
import java.util.Random;

/**
 * @author MZigomaar
 *
 */
public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3130146439070047495L;
	
	private Brand brand;
	private Color color;
	private int speed;
	
	private Owner owner;
	
	private Brand randomBrand() {
	    int pick = new Random().nextInt(Brand.values().length);
	    return Brand.values()[pick];
	}
	private Color randomColor() {
	    int pick = new Random().nextInt(Color.values().length);
	    return Color.values()[pick];
	}

	// CONTRUCTOR
	public Car() {
		this.brand = this.randomBrand();
		this.color = this.randomColor();
		this.speed = (new Random().nextInt((22 - 11) + 1) + 11) * 10;
	}
	public Car(Owner owner) {
		this.brand = this.randomBrand();
		this.color = this.randomColor();
		this.speed = (new Random().nextInt((22 - 11) + 1) + 11) * 10;
		this.owner = owner;
	}
	
	//GETTERS SETTERS
	public Brand getBrand() {return brand;}
	public void setBrand(Brand brand) {this.brand = brand;}

	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}

	public int getSpeed() {return speed;}
	public void setSpeed(int speed) {this.speed = speed;}
	
	public Owner getOwner() {return owner;}
	public void setOwner(Owner owner) {this.owner = owner;}
	
	//TOSTRING
	public String toString() {
		String res = "";
		if (this.owner != null) {
			res += owner.getName()+"'s car.\n";
		}
		return res+"Brand : "+brand+"\nColor : "+color+"\nSpeed : "+speed+"\n";
	}
	
}
