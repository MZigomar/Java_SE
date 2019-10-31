package ascii;

public class SuperSmash {

	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void main(String[] args) {

		int gr = 27;

		String res = "";
		int ordonnee = gr;
		int abscisse = -gr;

		for (int y = gr; y > abscisse; y--)
			for (int x = -gr; x < ordonnee; x++)

				if (y <= Math.sqrt(425 - x * x) && y >= -(Math.sqrt(425 - x * x)) // Cercle
						&& (y < -6 || y > -4) // Barre horizontale
						&& (x < -12 || x > -6)) // Barre Verticale

					// res += ANSI_WHITE_BACKGROUND+" ";
					res += "  ";
				else
					// res +=ANSI_RESET+ " ";
					res += "# ";

		res += "\n";

		System.out.println(res);
		System.out.println("fin");

	}

}