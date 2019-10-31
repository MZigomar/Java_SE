package test;

import java.util.*;

public class Shiny {

	public static void main(String[] args) {

		int simulations = 500;

		int min = 0, max = 0, total = 0;

		boolean cc = true;
		int bonus = 12;

		int proba = 4096;
		int chance = 1 + bonus;
		if (cc)
			chance += 2;

		int shiny, reset;
		ArrayList<Integer> resets = new ArrayList<Integer>();

		for (int i = 0; i < simulations; i++) {
			reset = -1;
			shiny = proba + 1;
			while (shiny > chance) {
				shiny = 1 + (int) (Math.random() * proba);
				// System.out.println(shiny);
				reset++;
			}

			// System.out.println("Reset : " + reset);
			resets.add(reset);

			if (reset > max) {
				max = reset;
				if (min == 0)
					min = max;
			} else if (reset < min)
				min = reset;
		}

		// System.out.println(resets.toString());

		for (Integer i : resets) {
			total += i;
		}

		System.out.println("--------------------------\nMoyenne resets : " + total / resets.size());
		System.out.println("Reset max : " + max);
		System.out.println("Reset min : " + min);

	}
}
