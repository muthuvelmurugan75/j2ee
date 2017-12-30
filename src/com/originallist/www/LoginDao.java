package com.originallist.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {  
	  
public static boolean validate(LoginBean originallist ){  
boolean status=true;  
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from user432 where email=? and pass=?");  
  
ps.setString(1,originallist.getEmail());  
ps.setString(2, originallist.getPass());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
              
}catch(Exception e){}  
  
return status;  
  
}  
}  