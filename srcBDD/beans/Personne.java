package beans;

import java.io.Serializable;
import java.util.*;

public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private Date birthDay;

	public Personne(String firstName, String lastName, Date birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}

	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}

	public Date getBirthDay() {return birthDay;}
	public void setBirthDay(Date birthDay) {this.birthDay = birthDay;}

	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay + "]";
	}

}
