package com.Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LMstore{
/*public void project1(String names, String message) throws ClassNotFoundException{
	Class.forName("oracle.jdbc.driver.OracleDriver");  

	final String name="SYSTEM";
	final String pass="oracle";
	final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
	Connection con;
	try {
		con = DriverManager.getConnection(dburl,name,pass);

		PreparedStatement pt=con.prepareStatement("insert into loginsystem (id,name,password,email) values('2'"+names+"','"+message+"')");
		ResultSet rs=pt.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
*/
public static void  project(String user, String userpass) throws ClassNotFoundException {
	// TODO Auto-generated method stub
	Class.forName("oracle.jdbc.driver.OracleDriver");  

	final String name="SYSTEM";
	final String pass="oracle";
	final String dburl="jdbc:oracle:thin:@localhost:1521:xe";
	Connection con;
	try {
		con = DriverManager.getConnection(dburl,name,pass);

		PreparedStatement pt=con.prepareStatement("insert into loginsystem (name,password) values('"+user+"','"+userpass+"')");
		ResultSet rs=pt.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}




