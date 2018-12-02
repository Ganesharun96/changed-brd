import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/upload")
public class login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//String name = request.getParameter("name");
		//String password = request.getParameter("password");
		String selection = request.getParameter("selection");
		
			if (selection.equals("filelevel")) {
//				response.sendRedirect("file.html");
				 response.sendRedirect("Fileuploaded.java");
			
//			 response.sendRedirect("Welcome.jsp");
		}else if (selection.equals("recordlevel"))
			{
			 response.sendRedirect("Fileuploaded1.java");
			}
		else{
		}
		}
	}
}

