package rpg;

public class main {

	public static void main(String[] args) {

		Heros mzigomar = new Heros ("MZigomar");
		Heros zug = new Heros ("ZUG");
		
		
		System.out.println(mzigomar);
		System.out.println(zug);
		
		mzigomar.Attaquer(zug);
		
		System.out.println(mzigomar);
		System.out.println(zug);
		
		
	}

}
