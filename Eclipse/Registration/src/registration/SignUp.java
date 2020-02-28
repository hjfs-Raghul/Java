package registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("user_mail");
		String pass = request.getParameter("user_pass");
		insertIntoDb(mail , pass);
		System.out.println("Mail ->"+mail+" Password ->"+pass);
		
	}
	
	void insertIntoDb(String mail , String pass) {
		//OJDBC Connection
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","sys as SYSDBA","oracle");
			Statement stmt = conn.createStatement();
			String qry = "insert into users(mail,pass) values('"+mail+"','"+pass+"')";
			System.out.println("Query ->" +qry);
			int row_affected = stmt.executeUpdate(qry);
			System.out.println("Rows affected ->" +row_affected);
			if(row_affected > 0)
				System.out.println("Successfully SignUp");
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	}


