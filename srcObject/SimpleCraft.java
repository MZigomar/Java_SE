import java.util.Random;

public class SimpleCraft {
	public Car craftCar() {
		int pick = new Random().nextInt(Names.values().length);
		return new Car(new Owner(Names.values()[pick]));
	}
}
