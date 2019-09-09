package com.worldpay.BookStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Sqlutil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/";
	private static final String DBPASS = "root";

	private static final String DBUSER = "root";
	private static final String DBNAME = "ashi";
	private static Statement st;

	


	public static Connection ConnectDB() {
		Connection Conn = null;
		try {
			Class.forName(DRIVER);
			Conn = DriverManager.getConnection(DBURL + DBNAME, DBUSER, DBPASS);
			System.out.println("Connected");
			
		} catch (Exception ex) {
			System.out.println("Problem in connection" + ex);
		}
		return Conn;
	}

	public static void create(String query) {
		try {
			if (st == null) {
				ConnectDB();
			}
			st.execute(query);
		} catch (Exception ex) {
			System.out.println("Problem in creation " + ex);
		}
	}
}
