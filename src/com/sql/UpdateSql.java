package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSql {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shashi75874@");
			Statement st = con.createStatement();
			int result = st.executeUpdate("update book SET book_name='hindi'where id=33");
			if (result > 0) {
				System.out.println("Update successfully");
			} else {
				System.out.println("Not Updated");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
