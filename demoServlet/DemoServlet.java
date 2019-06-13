import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServlet extends GenericServlet
{
  PrintWriter out;
  static int count=0;
  public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   destroy();
   out.println("<html><body>");
   out.println("Hello servlet via GenericServlet"+count);
   out.println("<br>");
   out.println(this);
   
   try
   {
     Thread.sleep(2000);
      out.println("<br>");
   }
   catch(Exception e)
   {}
   out.println("Thread Name="+Thread.currentThread().getName());
   out.println("</body></html>");
  }
  public void destroy(){
    out.println("destroy");
	count++;
   }
  
}