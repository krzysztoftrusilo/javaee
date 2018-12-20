package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class getWardrobeData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dodawanie szafy</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      com.example.servletdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      com.example.servletdemo.domain.Wardrobe wardrobe = null;
      synchronized (session) {
        wardrobe = (com.example.servletdemo.domain.Wardrobe) _jspx_page_context.getAttribute("wardrobe", PageContext.SESSION_SCOPE);
        if (wardrobe == null){
          wardrobe = new com.example.servletdemo.domain.Wardrobe();
          _jspx_page_context.setAttribute("wardrobe", wardrobe, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        <h2>Dodaj szafe</h2>\n");
      out.write("        <form action='addWardrobe.jsp' method='POST'>   \n");
      out.write("        \n");
      out.write("            Name: <input type='text' name='name' required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wardrobe.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br>\n");
      out.write("            \n");
      out.write("            Is wood: <input type='checkbox' name='isWood'\n");
      out.write("            ");

                if(wardrobe.isWood()) {
                    out.println("checked");
                }
            
      out.write("/><br>\n");
      out.write("            \n");
      out.write("            Weight: <input type='number' name='weight' step='any' required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wardrobe.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br>\n");
      out.write("            \n");
      out.write("            Production Date: <input type='date' name='productionDate' required\n");
      out.write("            ");

            	SimpleDateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
                out.println("value = '" + (wardrobe.getProductionDate())+ "'");
            
      out.write(" /><br>\n");
      out.write("            \n");
      out.write("            <input type='submit' value='Add'/>\n");
      out.write("        </form>\n");
      out.write("        <a href='index.jsp'>Go back</a>\n");
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