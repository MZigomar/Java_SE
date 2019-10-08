/**
 * 
 */
package exoTab;

import java.util.Scanner;

/**
 * @author MZigomaar
 *
 */
public class CalcTab {

	private int[] tab = null;

	public CalcTab (int size, int max, int min) {
		tab = new int[size];
		this.fill(size, max, min);;
	}
	
	public CalcTab (Scanner size, Scanner sc) {
		System.out.print("Type size : ");
		tab = new int[size.nextInt()];
		System.out.println("\nType "+tab.length+" values : ");
		for (int i = 0 ; i<tab.length ; i++) {
			tab[i]=sc.nextInt();
		}
	}
	
	public String fill(int i, int max, int min) {
		for(int j = 0 ; j < i ; j++) {
			tab[j] = (int)(Math.random() * ((max - min) + 1)) + min;
		}
		return "tab filled !";
	}
	
	
	public int min() {
		int min = tab[0];
		for (int i : tab) 
			if(i<min)
				min=i;
		return min;
	}
	
	public int max() {
		int max = tab[0];
		for (int i : tab) 
			if(i>max)
				max=i;
		return max;
	}
	
	public double moy() {
		double moy=0;
		for (int i : tab) {
			moy+=i;
		}
		return moy/tab.length;
	}
	
	
	public String toString() {
		String res = "< ";
		for (int i : tab) {
			res += i+" ; ";
		}
		return res.substring(0, res.length()-2)+">";
	}
}
