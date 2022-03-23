package com.bookstore.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
				Class.forName("com.mysql.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","Admin","Vanisree@17");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	

}