import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class second
 */
@WebServlet("/second")
public class second extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		if(a.equals("mphasis")&&b.equals("mphasis"))
			res.sendRedirect("success.html");
		else
			res.sendRedirect("failure.html");
		
	}
}

	