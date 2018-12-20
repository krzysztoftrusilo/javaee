package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import ug.adamtrawinski.javaee.sklep.domain.Laptop;

public final class buyLaptop_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Kup produkt</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      ug.adamtrawinski.javaee.sklep.service.StorageService storage = null;
      synchronized (application) {
        storage = (ug.adamtrawinski.javaee.sklep.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          try {
            storage = (ug.adamtrawinski.javaee.sklep.service.StorageService) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "ug.adamtrawinski.javaee.sklep.service.StorageService");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "ug.adamtrawinski.javaee.sklep.service.StorageService", exc);
          }
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <h2>Produkty:</h2>\n");
      out.write("        <table style='border-collapse: collapse;'>\n");
      out.write("            ");

                Iterator it = storage.getAllLaptops().values().iterator();
                Laptop l;
                while (it.hasNext()) {
                    l = (Laptop) it.next();
                    out.println("<tr style='border: 1px solid black'>" +
                            "<td>" + l.showDetails() + "</td>");
                    out.println("<td>");
                    out.println("<form action='addToCart.jsp' method='POST'>");
                    out.println("<input name='id' hidden value='" + l.getId() + "'/>");
                    out.println("<input type='submit' value='Do koszyka'/>");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("</tr>");
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href='summary.jsp'>Podsumowanie</a><br>\n");
      out.write("        <a href='index.jsp'>Powrót</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
