<%@ page import="java.util.Iterator" %>
<%@ page import="com.example.servletdemo.domain.Sock" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Buy Sock</title>
	</head>
	<body>
	<jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />
        <h2>Socks:</h2>
        <table style='border-collapse: collapse;'>
            <%
            Iterator it = storage.getAllSocks().values().iterator();
            Sock l;
            while (it.hasNext()) {
                l = (Sock) it.next();
                out.println("<tr style='border: 1px solid black'>" +
                        "<td>" + l.showDetails() + "</td>");
                out.println("<td>");
                out.println("<form action='addToCart.jsp' method='POST'>");
                out.println("<input name='id' hidden value='" + l.getId() + "'/>");
                out.println("<input type='submit' value='Add to cart'/>");
                out.println("</form>");
                out.println("</td>");
                out.println("</tr>");
            }
            %>
        </table>
        <a href='summary.jsp'>Summary</a><br>
        <a href='index.jsp'>Go back</a>
	

	</body>
</html>