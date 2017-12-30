package com.originallist.www;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDB {
	

	public String connection(String n,String p) throws SQLException{
		final String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		 final String username="SYSTEM";
		 final String passwor="oracle"; 
		Connection con = DriverManager.getConnection(dbUrl, username, passwor);
		PreparedStatement ps=con.prepareStatement("SELECT NAME,PASSWORD FROM JSP ");
		ResultSet rs=ps.executeQuery();
		 System.out.println("Oracle DB connection established successfully");
		 while(rs.next()) {
				 if( p.equals(rs.getString("PASSWORD"))){
					 System.out.println("yes");
				 }
				 else{
					 System.out.println("no");
				 }
				 
			 
		        		
		                           
		      }
		return p;
	
	}
	public static void main(String[] args) throws SQLException {
	
}}


