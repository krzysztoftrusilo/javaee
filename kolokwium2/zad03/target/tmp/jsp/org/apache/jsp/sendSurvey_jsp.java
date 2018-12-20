package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public final class sendSurvey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Survey sent</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  ");
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
      out.write("  ");
      com.example.servletdemo.service.SurveyService surveyStorage = null;
      synchronized (application) {
        surveyStorage = (com.example.servletdemo.service.SurveyService) _jspx_page_context.getAttribute("surveyStorage", PageContext.APPLICATION_SCOPE);
        if (surveyStorage == null){
          surveyStorage = new com.example.servletdemo.service.SurveyService();
          _jspx_page_context.setAttribute("surveyStorage", surveyStorage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("survey"), "frequency", request.getParameter("frequency"), request, "frequency", false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");

    List<String> selectedComments = new ArrayList<String>();
    for (String comment : request.getParameterValues("comments")) {
      selectedComments.add(comment);
    }
    survey.setComments(selectedComments);

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date dateFrom = format.parse(request.getParameter("usedFrom"));
    Date dateTo = format.parse(request.getParameter("usedTo"));
    survey.setFrom(dateFrom);
    survey.setTo(dateTo);
    surveyStorage.add(session.getId(), survey);
  
      out.write("\r\n");
      out.write("  <h2>Survey sent</h2>\r\n");
      out.write("\r\n");
      out.write("  <p>From:\r\n");
      out.write("      ");

      out.println(request.getParameter("usedFrom"));
    
      out.write("\r\n");
      out.write("  </p>\r\n");
      out.write("\r\n");
      out.write("  <p>To:\r\n");
      out.write("    ");

      out.println(request.getParameter("usedTo"));
    
      out.write("\r\n");
      out.write("  </p>\r\n");
      out.write("\r\n");
      out.write("  <p>Frequency: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.frequency}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("  <p>Others: <br>");

    for(String comment: survey.getComments()) {
        out.print(comment + "<br>");
    }
  
      out.write("</p>\r\n");
      out.write("  <p>\r\n");
      out.write("    <a href=\"index.jsp\">Go back</a>\r\n");
      out.write("  </p>\r\n");
      out.write("  </body>\r\n");
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
