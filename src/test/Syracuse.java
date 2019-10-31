package test;

import java.util.*;

public class Syracuse {

	public static void main(String[] args) {

		System.out.println("Saisir un entier > 0 : ");
		
		Scanner sc = new Scanner(System.in);
		int i = 1;

		try {
			i = sc.nextInt();
		} catch (Exception e) {
			System.out.println(sc.hasNextLine() + " n'est pas un nombre.");
		} finally {
			sc.close();
		}
		System.out.println(i);
		
		while (i>1) {
			if(i%2==0) 
				i/=2;
			else
				i=i*3+1;
			if(i==4)
				System.out.println("----------");
			System.out.println(i);
			
		}
	}
}
