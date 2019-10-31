package tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Plateau p = new Plateau(3, 3);

		System.out.println(p);
		while (!p.fini()) {
			try {
				
			if (p.isJ1Turn())
				p.jouerCroix(Positions.get(sc.nextLine().charAt(0)));
			else
				p.jouerRond(Positions.get(sc.nextLine().charAt(0)));
			} catch (Exception e) {
				System.out.println("Try again...");
			}

			System.out.println(p);
		}

		sc.close();

		System.out.println("Fin de partie");
		if (p.victoire())
			if (p.isJ1Turn())
				System.out.println("Victoire du J2 : O");
			else
				System.out.println("Victoire du J1 : X");
		else
			System.out.println("Match nul");
	}

}
