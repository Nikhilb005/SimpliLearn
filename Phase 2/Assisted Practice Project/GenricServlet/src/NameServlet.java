

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public NameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	PrintWriter pw=response.getWriter();
	pw.print("<html><body>");
	pw.print("Your name is : "+fname +" "+lname);
	pw.print("</html></body>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
