package ascii;

public class Mario {
	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void main(String[] args) {

		int gr = 27;

		String res = "";
		int ordonnee = gr;
		int abscisse = -gr;

		for (int y = gr; y > abscisse; y--)
			for (int x = -gr; x < ordonnee; x++)

				if (y >= Math.sqrt(500 - x * x) || y <= -(Math.sqrt(500 - x * x)) || x > Math.sqrt(500)
						|| x < -Math.sqrt(500)
						|| (y <= 3 * x + 40 && y >= 4 * x + 30 && y <= -x + 2 && y >= -x / 1.2 - 20)
						|| (y <= -3 * x + 40 && y >= -4 * x + 30 && y <= x + 2 && y >= x / 1.2 - 20)
						|| (y >= -x + 2 && y <= -x + 6 && y <= 3 * x + 40 && y >= x + 2)
						|| (y >= x + 2 && y <= x + 6 && y <= -3 * x + 40 && y >= -x + 2))

					// res += ANSI_RED+ANSI_RED_BACKGROUND+" o"+ANSI_RESET;
					res += " o";
				else

					// res += ANSI_WHITE+ANSI_WHITE_BACKGROUND+"o "+ANSI_RESET;
					res += "o ";

		res += "\n";

		System.out.println(res);
		System.out.println("fin");

	}

}
