package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class survey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Survey</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      com.example.servletdemo.domain.Survey survey = null;
      synchronized (session) {
        survey = (com.example.servletdemo.domain.Survey) _jspx_page_context.getAttribute("survey", PageContext.SESSION_SCOPE);
        if (survey == null){
          survey = new com.example.servletdemo.domain.Survey();
          _jspx_page_context.setAttribute("survey", survey, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h2>Fill the survey</h2>\r\n");
      out.write("    <form action='sendSurvey.jsp' method='POST'>\r\n");
      out.write("        From: <input type='date' name='usedFrom' required value=\"");

                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                out.print(df.format(survey.getFrom()));
            
      out.write("\" /><br>\r\n");
      out.write("        To: <input type='date' name='usedTo' required value=\"");

                out.print(df.format(survey.getTo()));
            
      out.write("\" /><br>\r\n");
      out.write("            \r\n");
      out.write("        <p>Frequency:</p>\r\n");
      out.write("        <input type=\"radio\" name=\"frequency\" value=\"Daily\" ");

            if(survey.getFrequency().equals("Daily")) {
                out.print("checked");
            }
        
      out.write(">Daily<br>\r\n");
      out.write("        <input type=\"radio\" name=\"frequency\" value=\"Weekly\" ");

            if(survey.getFrequency().equals("Weekly")) {
                out.print("checked");
            }
        
      out.write(">Weekly<br>\r\n");
      out.write("        <input type=\"radio\" name=\"frequency\" value=\"Once or twice\"");

            if(survey.getFrequency().equals("Once or twice")) {
                out.print("checked");
            }
        
      out.write(">Once or twice<br>\r\n");
      out.write("        \r\n");
      out.write("        <p>Others:</p>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"checkbox\" name=\"comments\" value=\"Two right socks\" ");

            if(survey.ifCommentSelected("Two right socks")) {
                out.print("checked");
            }
        
      out.write(">Two right socks<br>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"checkbox\" name=\"comments\" value=\"Holey socks\"");

            if(survey.ifCommentSelected("Holey socks")) {
                out.print("checked");
            }
        
      out.write(">Holey socks<br>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"checkbox\" name=\"comments\" value=\"Wrong product\" ");

            if(survey.ifCommentSelected("Wrong product")) {
                out.print("checked");
            }
        
      out.write(">Wrong product<br>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"checkbox\" name=\"comments\" value=\"Horrible delivery time\" ");

            if(survey.ifCommentSelected("Horrible delivery time")) {
                out.print("checked");
            }
        
      out.write(">Horrible delivery time<br>\r\n");
      out.write("        \r\n");
      out.write("        <button type=\"submit\">Send</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <p>\r\n");
      out.write("        <a href=\"index.jsp\">Go back</a>\r\n");
      out.write("    </p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
