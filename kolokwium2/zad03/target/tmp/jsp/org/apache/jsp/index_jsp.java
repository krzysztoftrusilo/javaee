package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shop</title>\n");
      out.write("    ");
      com.example.servletdemo.domain.Rodo rodo = null;
      synchronized (application) {
        rodo = (com.example.servletdemo.domain.Rodo) _jspx_page_context.getAttribute("rodo", PageContext.APPLICATION_SCOPE);
        if (rodo == null){
          rodo = new com.example.servletdemo.domain.Rodo();
          _jspx_page_context.setAttribute("rodo", rodo, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("</head>\n");

if(request.getParameter("rodo")!=null && request.getParameter("rodo2")!=null)
{
	rodo.setRodo(true);
	rodo.setRodo2(true);
}
if(request.getParameter("newsletter")!=null)
{
	rodo.setNewsletter(true);
}
if(!rodo.isRodo() && !rodo.isRodo2())
{
	response.sendRedirect("rodo.jsp");
}

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h2>Welcome in sock shop!!!</h2>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href='getSockData.jsp'>Add Sock</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href='buySock.jsp'>Buy Sock</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href='summary.jsp'>Summary</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href='survey.jsp'>Fill survey</a>\n");
      out.write("            </li>                      \n");
      out.write("        </ul>\n");
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
