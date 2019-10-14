import java.util.Date;
import java.util.Scanner;

import beans.*;
import dao.*;

public class Main {

	public static void main(String[] args) {
		TestJdbc t = new TestJdbc();
		
		@SuppressWarnings("deprecation")
		//Personne p = new Personne("Hello", "World", new Date(2019, 10, 10) );

		//Scanner sc = new Scanner(System.in);
		
		String query = new Scanner(System.in).nextLine();

		t.test(query);
	}
	
}
