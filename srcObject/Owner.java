
public class Owner {

	private Names name;
	
	public Owner (Names name) {
		this.name = name;
	}
	
	public Names getName() {
		return name;
	}

	public void setName(Names name) {
		this.name = name;
	}

	public String toString() {
		return name.toString();
	}
	
}
