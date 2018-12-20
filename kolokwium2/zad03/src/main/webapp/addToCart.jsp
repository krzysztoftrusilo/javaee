<%@ page import="com.example.servletdemo.domain.Sock" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>
</head>
<body>

    <jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />
    <jsp:useBean id="cart" class="com.example.servletdemo.service.StorageService" scope="session" />

    <%
        Map<Long, Sock> socks = storage.getAllSocks();
        Sock sock = socks.get(Long.valueOf(request.getParameter("id")));
        cart.add(sock);
    %>

    <h2>Add to cart</h2>
    <p>
        <a href="summary.jsp">Summary</a><br>
        <a href="buySock.jsp">Buy another sock</a>
    </p>

</body>
</html>