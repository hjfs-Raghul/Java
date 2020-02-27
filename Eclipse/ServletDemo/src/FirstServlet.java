

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")		//URL to hit in the browser

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter ps =  resp.getWriter();
		ps.println("<html><head></head><body><h1>HII Raghul</h1></body></html>");
		System.out.println("Hiiii POST");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hiiii PUT");
	}
	
	
	

}
