package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectsql {

	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String select="select * from book";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Shashi75874@");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(select);
			
			System.out.print("id" +"\t");
			System.out.print("book_name" +"\t");
			System.out.print("authore" +"\t");
			
			
			while(rs.next())
			{
			System.out.print(rs.getInt(1)+ "\t" +"\t" );
			
			System.out.print(rs.getString(2)+ "\t"+"\t" );
			
			System.out.print(rs.getString(3)+ "\t"+"\t" );
			
			System.out.println();
			
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
