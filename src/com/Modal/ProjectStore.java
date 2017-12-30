package com.Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectStore {

	public boolean projectlogin(String names, String password) throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		final String name="SYSTEM";
		final String pass="oracle";
		final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con;
		try {
			con = DriverManager.getConnection(dburl,name,pass);
			String query = "select * from loginsystem where name='"+names+"' and password='"+password+"'";
			//String query = "select * from loginsystem"; 
			System.out.println(query);
			PreparedStatement pt=con.prepareStatement(query);
			ResultSet rs=pt.executeQuery();
			if(rs.next())
			{
				System.out.println("login succcess");
				return true;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
