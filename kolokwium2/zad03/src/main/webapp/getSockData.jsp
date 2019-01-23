<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add sock</title>
    </head>
    <body>
    <jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />
    <jsp:useBean id="sock" class="com.example.servletdemo.domain.Sock" scope="session" />

        <h2>Add Sock</h2>
        <form action='addSock.jsp' method='POST'>   
        
            Name: <input type='text' name='name' required value="${sock.name}" /> <br>
            
            Has toes: <input type='checkbox' name='isToes'
            <%
                if(sock.isToes()) {
                    out.println("checked");
                }
            %>/><br>
            Is plain: <input type='checkbox' name='isPlain'
            <%
                if(sock.isPlain()) {
                    out.println("checked");
                }
            %>/><br>            
            Price: <input type='number' name='price' step='any' required value="${sock.price}" /><br>
            
            Production Date: <input type='date' name='productionDate' required
            <%
            	SimpleDateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
                out.println("value = '" + (sock.getProductionDate())+ "'");
            %> /><br>
            
            <input type='submit' value='Add'/>
        </form>
        <a href='index.jsp'>Go back</a>
    </body>
</html>
