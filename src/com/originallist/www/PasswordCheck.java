package com.originallist.www;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
String empusr="";
String emppass="";
System.out.println("enter user name");
String a=obj.next();
System.out.println("enter password");
String b=obj.next();
empusr=empusr+a;
System.out.println(empusr);
emppass=emppass+b;
System.out.println(emppass);
System.out.println("enter ur wish");
String choice=obj.next();
switch (choice){
case "login":
	System.out.println(empusr+" "+emppass);
	break;
case "logout":
	System.out.println("u r logged out");
	break;
case "reset":
	empusr=null;
	emppass=null;
	choice="call";
	System.out.println("enter user name");
	empusr=obj.next();
	System.out.println("enter password");
	emppass=obj.next();
	System.out.println("ur new username and password"+empusr+"/n"+emppass);
	break;
	
case "exit":
	
	System.exit(1);
	break;
}
obj.close();
	}

}
