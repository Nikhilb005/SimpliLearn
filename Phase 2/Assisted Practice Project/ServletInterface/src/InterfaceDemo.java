

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InterfaceDemo implements Servlet {
	ServletConfig config=null;
	
	public void init(ServletConfig arg0) throws ServletException {
		this.config=config;
		System.out.println("Initialization complete");	
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("In the service method");
		pw.print("</html></body>");
	}
	
	public void destroy() {
		System.out.println("In the destroy()");
	}
	
	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
	return "this is sample servlet info"; 
	}
	

	
}
