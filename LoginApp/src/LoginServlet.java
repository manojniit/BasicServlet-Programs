

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");	
PrintWriter pw = response.getWriter();
String un =request.getParameter("un");
String pwd =request.getParameter("pw");
if(un.equals("manoj")&&pwd.equals("tejasri"))
{
pw.print("<h1>successfully logged in</h1>");	
}
else {
	pw.print("<h1>sorry</h1>");
}
	}
}
