package Trial.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/*
 * This is a sample git project
 */
public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Servlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("Welcome to Servlet Testing for github");
		out.println("</BODY>");
		out.println("</HTML>");
		
	}
}
