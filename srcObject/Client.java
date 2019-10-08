
public class Client {

	public static void main(String[] args) {

		System.out.println("Here comes my cars :\n");
		Car[] shopCar = new Car[10];
		/*
		 * for (Car car : shopCar) { car = new Car();
		 * System.out.println(car+"\n--------------------"); }
		 */

		CarFactory carFactory = new CarFactory();

		for (Car car : shopCar) {
			car = carFactory.craftACar();
			System.out.println(car);
		}

		
		
	}

}