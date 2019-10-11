package dao;

import java.sql.*;

import beans.*;

public class TestJdbc {

	private String url = "jdbc:mysql://localhost/test";
	private String user = "root";
	private String password = "";

	public void test(Personne p) {

		Connection con = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();

			st.executeUpdate("insert into Personne(firstName, lastName, birthDay)values('" + p.getFirstName() + "','"
					+ p.getLastName() + "','" + p.getBirthDay().toString() + "')");

		} catch (ClassNotFoundException e1) {
			System.out.println("Driver loading error");
		} catch (SQLException e2) {
			System.out.println("Base connection error");
		} finally {
			try {
				System.out.println("Closing...");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Finally");

		}

	}

}
