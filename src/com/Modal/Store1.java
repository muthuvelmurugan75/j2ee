package com.Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Store1  {
	
	public boolean login(String names, String password) throws ClassNotFoundException{
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
	
	public ArrayList getStudent() throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		final String name="SYSTEM";
		final String pass="oracle";
		final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con;
		
		ArrayList<HashMap> student = new  ArrayList();
		try {
			con = DriverManager.getConnection(dburl,name,pass);
			String query = "select * from loginsystem";
			//String query = "select * from loginsystem"; 
			System.out.println(query);
			PreparedStatement pt=con.prepareStatement(query);
			ResultSet rs=pt.executeQuery();
			while(rs.next())
			{
				HashMap hm = new HashMap();
				hm.put("name", rs.getString("name"));
				hm.put("password", rs.getString("password"));
				System.out.println(hm);
				student.add(hm);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	

	public ArrayList getLibrarydetails() throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		final String name="SYSTEM";
		final String pass="oracle";
		final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con;
		
		ArrayList<HashMap> student = new  ArrayList();
		try {
			con = DriverManager.getConnection(dburl,name,pass);
			String query = "select * from library";
			//String query = "select * from loginsystem"; 
			System.out.println(query);
			PreparedStatement pt=con.prepareStatement(query);
			ResultSet rs=pt.executeQuery();
			while(rs.next())
			{
				HashMap hm = new HashMap();
				hm.put("id", rs.getString("id"));
				hm.put("name", rs.getString("name"));

				hm.put("bookname", rs.getString("bookname"));
				hm.put("bookamount", rs.getString("bookamount"));

				System.out.println(hm);
				student.add(hm);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	

}
	
	