package com.worldpay.BookStore;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/InsertDetails")
public class Insert extends HttpServlet {
	private String bookName;
	private String Subject;
	private String Price;
	private String Edition;
	static final long serialVersionUID = 1L;
	private static final String SQL_INSERT = "INSERT INTO BOOKS (Book_Name,Subject,Edition,Price) VALUES(?,?,?,?)";

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		bookName = request.getParameter("name");
		Subject = request.getParameter("subject");
		Price = request.getParameter("price");
		Edition = request.getParameter("edition");
		

		DataInsert(bookName,Subject,Price,Edition);
	}
	public void DataInsert(String bookName,String subject,String price,String edition) {
		System.out.println("DataInsert Is Called");
		try {
			java.sql.PreparedStatement PS = Sqlutil.ConnectDB().prepareStatement(SQL_INSERT);
			PS.setString(1, bookName);
			PS.setString(2, subject);
			PS.setString(3, edition);
			PS.setInt(4, Integer.parseInt(price));
			int number = PS.executeUpdate();
			System.out.println("Inserted Successfully..Total rows added " + number);
			PS.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
