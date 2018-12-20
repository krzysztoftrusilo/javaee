package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class addWardrobe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Add Wardrobe</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  ");
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
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("wardrobe"), "name", request.getParameter("name"), request, "name", false);
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("wardrobe"), "weight", request.getParameter("weight"), request, "weight", false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
      com.example.servletdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("  ");

    String myCheckBoxValue = request.getParameter("isWood");

    boolean isWood;
    String state;
    if (myCheckBoxValue == null) {
      isWood = false;
      state = "No";
    }
    else {
      isWood = true;
      state = "Yes";
    }

    DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
    Date date = format.parse(request.getParameter("productionDate"));
    wardrobe.setProductionDate(date);
    wardrobe.setWood(isWood);
    storage.add(wardrobe);

  
      out.write("\n");
      out.write("\n");
      out.write("    <h2>Wardrobe added:</h2>\n");
      out.write("\n");
      out.write("    <p>Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wardrobe.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("    <p>Is Wood:\n");
      out.write("      ");

        out.println(state);
      
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <p>Weight: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wardrobe.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("    <p>Production Date:\n");
      out.write("    ");

      out.println(request.getParameter("productionDate"));
    
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      <a href=\"index.jsp\">Go back</a>\n");
      out.write("    </p>\n");
      out.write("  </body>\n");
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
