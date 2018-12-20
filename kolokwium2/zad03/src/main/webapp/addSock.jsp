<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Sock</title>
  </head>
  <body>
  <jsp:useBean id="sock" class="com.example.servletdemo.domain.Sock" scope="session" />

  <jsp:setProperty name="sock" property="name" param="name" />
  <jsp:setProperty name="sock" property="price" param="price" />


  <jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />

  <%
    String myCheckBoxValue = request.getParameter("isToes");

    boolean isToes;
    String state;
    if (myCheckBoxValue == null) {
      isToes = false;
      state = "No";
    }
    else {
      isToes = true;
      state = "Yes";
    }

    DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
    Date date = format.parse(request.getParameter("productionDate"));
    sock.setProductionDate(date);
    sock.setToes(isToes);
    storage.add(sock);

  %>

    <h2>Sock added:</h2>

    <p>Name: ${sock.name} </p>
    <p>Has toes:
      <%
        out.println(state);
      %>
    </p>
    <p>Price: ${sock.price} </p>
    <p>Production Date:
    <%
      out.println(request.getParameter("productionDate"));
    %>
    </p>
    <p>
      <a href="index.jsp">Go back</a>
    </p>
  </body>
</html>