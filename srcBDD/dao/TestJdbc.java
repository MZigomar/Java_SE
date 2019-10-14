package dao;

import java.sql.*;

import beans.*;

public class TestJdbc {

	private String url = "jdbc:mysql://localhost/test";
	private String user = "root";
	private String password = "";

	public void test(String query) {

		Connection con = null;
		Statement st = null;

		// String query1 = "insert into Personne values('" + p.getFirstName() + "','"+
		// p.getLastName() + "','DateTest')"; //" + p.getBirthDay().toString() + "')");
		String query2 = query.toString(); // "select * from personne;";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();

			// Update BDD
			// st.executeUpdate(query1);

			// Select BDD
			ResultSet rs = st.executeQuery(query2);
			System.out.println("Query = " + query2);
			while (rs.next()) {
				System.out.println("rs.next");
				
				System.out.println("Name : " + rs.getString(1) + " " + rs.getString(2) + " \n" + rs.getString(3));
			}

		} catch (ClassNotFoundException e1) {
			System.out.println("e1 = " + e1.toString());
			System.out.println("Driver loading error");
		} catch (SQLException e2) {
			System.out.println("e2 = " + e2.toString());
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