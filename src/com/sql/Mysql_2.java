package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Mysql_2 {
	public static void main(String[] args) {
        HashMap<Integer, String>hm= new HashMap<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shashi75874@");

			Statement stmt = con.createStatement();

			// ResultSet rs= stmt.executeQuery("select * from book");

			ResultSet rs1 = stmt.executeQuery("select id,book_name,authore from book order by id");

//			while(rs.next()) 
//		    System.out.println(rs.getInt(1)+" " +rs.getString(2)+ " "+ rs.getString(3));
//			

			while (rs1.next())
				hm.put(rs1.getInt(1), rs1.getString(2));
				

			// con.close();

		} catch (Exception e) {

			System.out.println(e);
		}

		
		System.out.println(hm);
		
	}

}
