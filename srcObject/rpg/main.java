package rpg;

public class main {

	public static void main(String[] args) throws InterruptedException {

		Heros mzigomar = new Guerrier("MZigomar");
		Heros zug = new Mage("ZUG");

		System.out.println("NEW CHALLENGERS : \n");			
		Thread.sleep(2000);
		System.out.println(mzigomar);
		System.out.println(zug);			
		Thread.sleep(2000);

		while (zug.isAlive() && mzigomar.isAlive()) {

			mzigomar.Attaquer(zug);
			
			Thread.sleep(2000);
			
			System.out.println(mzigomar);
			System.out.println(zug);			
			Thread.sleep(2000);

			if (zug.isAlive()) {
				zug.Attaquer(mzigomar);			
				Thread.sleep(2000);

				System.out.println(mzigomar);
				System.out.println(zug);			
				Thread.sleep(2000);
			}
		}

	}

}
