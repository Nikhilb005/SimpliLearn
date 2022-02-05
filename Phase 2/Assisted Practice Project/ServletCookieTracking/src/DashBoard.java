
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie =null;
		Cookie cookies[]=null;
		boolean found =false;
		
		PrintWriter pw=response.getWriter();
		pw.print("<html><body>");
		cookies=request.getCookies();
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				cookie=cookies[i];
				if(cookie.getName().contentEquals("userid")&& cookie.getValue()!=null) {
					pw.println("userid read from the cookie "+cookie.getValue()+"<br>");
					found=true;
				}
			}
		}
		if(!found) {
			pw.print("userid not found in the cookie <br>");
		}
		pw.print("</body></html>");
	}

}
