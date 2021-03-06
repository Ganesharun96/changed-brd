package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.And;

import sun.security.action.GetIntegerAction;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/RegistrationController")
public class loginuser extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("Newfile.html");
		try {
		String Customer_ID = request.getParameter("Customer_ID");
		String Customer_Code = request.getParameter("Customer_Code");
		String Customer_Name = request.getParameter("Customer_Name");
		String Customer_Address1 = request.getParameter("Customer_Address1");
		String Customer_Address2 = request.getParameter("Customer_Address2");
		String Customer_PinCode = request.getParameter("Customer_PinCode");
		String Email_Address = request.getParameter("Email_Address");
		String Contact_Number = request.getParameter("Contact_Number");
		String Primary_Contact = request.getParameter("Primary_Contact");
		String Record_Status = request.getParameter("Record_Status");
		String Active_Inactive_Flag = request.getParameter("Active_Inactive_Flag");
		String Create_Date = request.getParameter("Create_Date");
		String Created_By = request.getParameter("Created_By");
		String Modified_Date = request.getParameter("Modified_Date");
		String Modified_By = request.getParameter("Modified_By");
		String Authorized_Date = request.getParameter("Authorized_Date");
		String Authorized_By = request.getParameter("Authorized_By");
		
		}catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
		
		public static void customer(String Customer_ID, String Customer_Code,String Customer_Name,String Customer_Address1,String Customer_Address2,String Customer_PinCode,String Email_Address,String Contact_Number,String Primary_Contact ,String Record_Status,String Active_Inactive_Flag,String Create_Date,String Created_By,String Modified_Date,String Modified_By,String Authorized_Date,String Authorized_By ) throws ClassNotFoundException {

			try {
	
//		String	names=name;
//		String	passwords=password;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into NEWUSER values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1,  Customer_ID);
			preparedStatement.setString(2,  Customer_Code);
			preparedStatement.setString(3,  Customer_Name);
			preparedStatement.setString(4,  Customer_Address1);
			preparedStatement.setString(5,  Customer_Address2);
			preparedStatement.setString(6,  Customer_PinCode);
			preparedStatement.setString(7,  Email_Address);
			preparedStatement.setString(8,  Contact_Number);
			preparedStatement.setString(9,  Primary_Contact);
			preparedStatement.setString(10,  Record_Status);
			preparedStatement.setString(11,  Active_Inactive_Flag);
			preparedStatement.setString(12,  Create_Date);
			preparedStatement.setString(13,  Created_By);
			preparedStatement.setString(14,  Modified_Date);
			preparedStatement.setString(15,  Modified_By);
			preparedStatement.setString(16,  Authorized_Date);
			preparedStatement.setString(17,  Authorized_By);
			
			
			//Execute a Query
//			String insertQuery = "insert into GANESH_CUSTOMER_NAME(" + employeeID + ",'" + firstName + "')";
//			//System.out.println(insertQuery);
//			int noOfRowsAffected = statement.executeUpdate(insertQuery);
//			//Iterate through the result set and display the records.
//			System.out.println(noOfRowsAffected + " row(s) inserted!");
			
			preparedStatement.executeUpdate();
}catch (ClassNotFoundException exception) {
	System.out.println(exception);
} catch (SQLException exception) {
	System.out.println(exception);
}
	}
}
