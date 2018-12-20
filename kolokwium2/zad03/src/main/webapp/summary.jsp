<%@ page import="java.util.Iterator" %>
<%@ page import="com.example.servletdemo.domain.Sock" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>All socks</title>
</head>
<body>
<jsp:useBean id="cart" class="com.example.servletdemo.service.StorageService" scope="session" />
    <h2>Cart:</h2>
    <table style='border-collapse: collapse;'>
        <%
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
        %>
    </table>
    <a href='index.jsp'>Go back</a>
</body>
</html>