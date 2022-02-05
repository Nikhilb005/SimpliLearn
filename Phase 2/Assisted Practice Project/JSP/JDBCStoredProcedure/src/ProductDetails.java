
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProductDetails() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  try {
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              System.out.println("hello  ");
             InputStream in = getServletContext().getResourceAsStream("/WEB-INF/abc.txt");
             Properties props = new Properties();
             props.load(in);
             System.out.println("hello  ");
             DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
             CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
             stmt.setString(1, "new product");
             stmt.setBigDecimal(2, new BigDecimal(1900.50));
             stmt.executeUpdate();
             
             out.println("Stored procedure has been executed.<Br>");
             stmt.close();
     
             out.println("</body></html>");
             conn.closeConnection();
             
     } catch (ClassNotFoundException e) {
             e.printStackTrace();
     } catch (SQLException e) {
             e.printStackTrace();
     }
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
