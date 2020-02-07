package com.java.gloss;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDb {
	public static void main(String[] args) {
		String jdbc="jdbc:mysql://localhost:3306/gloss-tables?allowPublicKeyRetrieval=true&useSSL=false";
		String user="glossuser";
		String pass="glossuser";
		
		try {
			System.out.println("Connecting:");
			Connection conn=DriverManager.getConnection(jdbc,user,pass);
			System.out.println("Connected!!");
		}catch(Exception exc) {
			
			exc.printStackTrace();
		}
	}
}
