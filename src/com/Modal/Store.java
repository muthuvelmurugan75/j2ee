package com.Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.batch.Main;


public class Store  {
	
	public void saveMsg(String names, String message) throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		final String name="SYSTEM";
		final String pass="oracle";
		final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con;
		try {
			con = DriverManager.getConnection(dburl,name,pass);
			PreparedStatement pt=con.prepareStatement("insert into messagevalue (id,name,MESSAGE) values('5','"+names+"','"+message+"')");
			ResultSet rs=pt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void librarydetails(String i,String username, String bookname,String bookamount) throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		final String name="SYSTEM";
		final String pass="oracle";
		final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con;
		try {
			con = DriverManager.getConnection(dburl,name,pass);
			PreparedStatement pt=con.prepareStatement("insert into library (id,name,bookname,bookamount) values('"+i+"','"+username+"','"+bookname+"','"+bookamount+"')");
			ResultSet rs=pt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
