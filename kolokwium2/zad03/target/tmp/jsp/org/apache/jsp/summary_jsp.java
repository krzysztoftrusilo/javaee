package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import com.example.servletdemo.domain.Sock;
import java.util.Map;

public final class summary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>All wardrobes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      com.example.servletdemo.service.StorageService cart = null;
      synchronized (session) {
        cart = (com.example.servletdemo.service.StorageService) _jspx_page_context.getAttribute("cart", PageContext.SESSION_SCOPE);
        if (cart == null){
          cart = new com.example.servletdemo.service.StorageService();
          _jspx_page_context.setAttribute("cart", cart, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    <h2>Cart:</h2>\r\n");
      out.write("    <table style='border-collapse: collapse;'>\r\n");
      out.write("        ");

        double total = 0;
        Map<Long, Sock> socks = cart.getAllSocks();
        if(socks.size() > 0) {
            Iterator it = socks.values().iterator();
            Sock s;
            while (it.hasNext()) {
                s = (Sock) it.next();
                total += s.getPrice();
                out.println("<tr style='border: 1px solid black'>" +
                        "<td>" + s.showDetails() + "</td>");
                out.println("<td>");
                out.println("</tr>");
            }
        } else {
            out.println("<h2>Cart is empty</h2>");
        }
        
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    <a href='index.jsp'>Go back</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
