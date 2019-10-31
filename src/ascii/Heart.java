package ascii;

public class Heart {

	public static void main(String[] args) {

		int gr = 27;

		String res = "";
		int ordonnee = gr;
		int abscisse = -gr;

		for (int y = gr; y > abscisse; y--)
			for (int x = -gr; x < ordonnee; x++)

				if (y <= 3 * Math.sin(x / 3 + 11) + 10 && x > -19 && x < 19 && y > 1.6 * x - 30 && y > -1.6 * x - 30
						&& y > x - 21 && y > -x - 21 && y > -20)
					res += "o ";

				else
					res += " .";

		res += "\n";

		System.out.println(res);
		System.out.println("fin");

	}

}
