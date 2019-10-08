package rpg;

public class main {

	public static void main(String[] args) throws InterruptedException {

		int pause = 1000;
		
		Heros mzigomar = new Guerrier("MZigomar", Arme.values()[1] );
		Heros zug = new Mage("ZUG",  Arme.values()[0] );

		System.out.println("NEW CHALLENGERS : \n");			
		Thread.sleep(pause);
		System.out.println(mzigomar);
		System.out.println(zug);			
		Thread.sleep(pause);

		while (zug.isAlive() && mzigomar.isAlive()) {

			mzigomar.Attaquer(zug);
			
			Thread.sleep(pause);
			
			System.out.println(mzigomar);
			System.out.println(zug);			
			Thread.sleep(pause);

			if (zug.isAlive()) {
				zug.Attaquer(mzigomar);			
				Thread.sleep(pause);

				System.out.println(mzigomar);
				System.out.println(zug);			
				Thread.sleep(pause);
			}
		}

	}

}
