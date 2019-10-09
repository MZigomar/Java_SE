package animals;

public class main {

	public static void main(String[] args) {

		Cat shiro = new Cat();
		Animal chat = new Cat();

		System.out.println(shiro.makeSomeNoise());
		System.out.println(shiro.ronron() + "\n----------");

		Cat oliver = (Cat) chat;

		System.out.println(oliver.makeSomeNoise());

		System.out.println(oliver.ronron());

	}

}
