
public class CarFactory {

	private SimpleCraft simpleCraft;

	public CarFactory() {
		// TODO Auto-generated constructor stub
		this.simpleCraft = new SimpleCraft();
	}

	public Car craftACar() {
		Car c = this.simpleCraft.craftCar();
		return c;
	}
}
