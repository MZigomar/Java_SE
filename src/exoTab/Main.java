package exoTab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CalcTab tab1 = new CalcTab(sc, sc);
		
		System.out.println(tab1.toString());
		System.out.println("Minimum = "+tab1.min());
		System.out.println("Maximum = "+tab1.max());
		System.out.println("Moyenne = "+tab1.moy());
	}

}
