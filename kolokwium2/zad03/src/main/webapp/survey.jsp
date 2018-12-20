<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Survey</title>
</head>
<body>
    <jsp:useBean id="survey" class="com.example.servletdemo.domain.Survey" scope="session" />

    <h2>Fill the survey</h2>
    <form action='sendSurvey.jsp' method='POST'>
        From: <input type='date' name='usedFrom' required value="<%
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                out.print(df.format(survey.getFrom()));
            %>" /><br>
        To: <input type='date' name='usedTo' required value="<%
                out.print(df.format(survey.getTo()));
            %>" /><br>
            
        <p>Frequency:</p>
        <input type="radio" name="frequency" value="Daily" <%
            if(survey.getFrequency().equals("Daily")) {
                out.print("checked");
            }
        %>>Daily<br>
        <input type="radio" name="frequency" value="Weekly" <%
            if(survey.getFrequency().equals("Weekly")) {
                out.print("checked");
            }
        %>>Weekly<br>
        <input type="radio" name="frequency" value="Yearly"<%
            if(survey.getFrequency().equals("Yearly")) {
                out.print("checked");
            }
        %>>Yearly<br>
        
        <p>Others:</p>
        
        <input type="checkbox" name="comments" value="Pests in wardrobe" <%
            if(survey.ifCommentSelected("Pests in wardrobe")) {
                out.print("checked");
            }
        %>>Pests in wardrobe<br>
        
        <input type="checkbox" name="comments" value="Lack of doors"<%
            if(survey.ifCommentSelected("Lack od doors")) {
                out.print("checked");
            }
        %>>Lack of doors<br>
        
        <input type="checkbox" name="comments" value="Wrong product" <%
            if(survey.ifCommentSelected("Wrong product")) {
                out.print("checked");
            }
        %>>Wrong product<br>
        
        <input type="checkbox" name="comments" value="Horrible delivery time" <%
            if(survey.ifCommentSelected("Horrible delivery time")) {
                out.print("checked");
            }
        %>>Horrible delivery time<br>
        
        <button type="submit">Send</button>
    </form>
    <p>
        <a href="index.jsp">Go back</a>
    </p>
</body>
</html>
