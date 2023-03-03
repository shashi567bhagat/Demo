package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlcon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		// com.mysql.jdbc.Driver ->old
		// com.mysql.cj.jdbc.Driver ->new
		String query = "select * from book";
		String INSERT = "insert into book(`book_name`,`authore`) VALUES('MATH','cHANCHAL')";
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shashi75874@");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// here libraby is database name, root is username and password =Shashi75874@
		Statement stmt=null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int result=stmt.executeUpdate(INSERT);
			if(result>0)
			{System.out.println("data save");
			}
			else
			{
				System.out.println("failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs=null;
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("id" + "\t");
		System.out.print("book_name" + "\t");
		System.out.print("authore" + "\t");
		System.out.println();

		try {
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t" + "\t");
				System.out.print(rs.getString(3) + "\t" + "\t");
				System.out.println();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
