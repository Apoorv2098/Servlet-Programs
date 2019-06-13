import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServlet1 implements Servlet
{
  public void init(ServletConfig con)
  {}
  public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html><body>");
   out.println("Hello servlet via Servlet interface");
   out.println("<br>");
   out.println("Refrence id=" +this);
   out.println("<br>");
   out.println("Thread Name="+Thread.currentThread().getName());
   try
   {
     Thread.sleep(1500);
   }
   catch(Exception e)
   {}
   out.println("</body><html>");
  }
  public void destroy(){}
  public ServletConfig getServletConfig()
  {
   return null;
  }
  public String getServletInfo()
  {
    return null;
   }
}