package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import string.String_Method_start;

public class DeleteSql {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shashi75874@");
			Statement st = con.createStatement();
			int Result = st.executeUpdate("Delete from book where id=34");
			if (Result > 0) {
				System.out.println("Delete Successfully");
			} else {
				System.out.println("not Deleted data");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
