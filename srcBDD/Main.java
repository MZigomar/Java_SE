import java.util.Date;

import beans.*;
import dao.*;

public class Main {

	public static void main(String[] args) {
		TestJdbc t = new TestJdbc();
		
		@SuppressWarnings("deprecation")
		Personne p = new Personne("Hello", "World", new Date(2019, 10, 10) );
		
		t.test(p);
	}
	
}
