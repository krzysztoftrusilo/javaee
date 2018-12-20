<%@ page import="java.util.Iterator" %>
<%@ page import="com.example.servletdemo.domain.Wardrobe" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>All wardrobes</title>
</head>
<body>
<jsp:useBean id="cart" class="com.example.servletdemo.service.StorageService" scope="session" />
    <h2>Cart:</h2>
    <table style='border-collapse: collapse;'>
        <%
        double total = 0;
        Map<Long, Wardrobe> wardrobes = cart.getAllWardrobes();
        if(wardrobes.size() > 0) {
            Iterator it = wardrobes.values().iterator();
            Wardrobe w;
            while (it.hasNext()) {
                w = (Wardrobe) it.next();
                total += w.getWeight();
                out.println("<tr style='border: 1px solid black'>" +
                        "<td>" + w.showDetails() + "</td>");
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