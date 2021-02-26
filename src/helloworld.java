import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloworld")
public class helloworld extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	   public helloworld()
	   {
	      super();
	   }

	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      
	      // #2
	      retrieveDisplayData(response.getWriter());
	   }

	   void retrieveDisplayData(PrintWriter out) {
	      String title = "Hello World!";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
	            "transitional//en\">\n"; //
	      out.println(docType + //
	            "<html>\n" + //
	            "<head><title>" + title + "</title></head>\n");

	      out.println("Hello World!!");
	      

	      out.println("</body></html>");
	   }

	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      doGet(request, response);
	   }
}
