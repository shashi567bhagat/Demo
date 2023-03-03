package com.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSql {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shashi75874@");
			Statement st = con.createStatement();
			String insert =  "insert into book(`book_name`,`authore`) VALUES('Biology','David M'),('electromagnetic','fauges')";
			int result1=st.executeUpdate(insert);
			System.out.println(result1);
			if(result1>0)
			{
				System.out.println("data save");
				
			}
			else
			{
				System.out.println("failed");
			}
			

		} catch (Exception e) {
			System.out.println(e);
		}finally
		{
//			if(con!=null)
//			con.close();
		}

	}

}
