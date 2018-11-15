<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
    
<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
	
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>RODO Index</title>
	</head>
	<body>
				<h1>Polityka RODO</h1>
				<h3>Pola obowiazkowe do kontynuacji</h3>
				<form action="rodo" method="get">
				<input type="checkbox" name="firstRodo"> Zgadzam sie z polityka RODO <br/>
				<input type="checkbox" name="secondRodo"> Rozumiem i zgadzam sie na warunki umowy <br/>
				<br/>
				<h3>Pola opcjonalne, ale zalecane</h3>
				<input type="checkbox" name="newsletter"> Zgadzam sie uczestniczyc w newsletter
				<br/>
				
				
				<c:if test="${sessionScope.rodo eq 'off'}">
					<p>Musisz zaakceptowac polityke RODO!</p>
				</c:if>
				
				<button style="margin: 10px" type="submit">Wyslij</button>
				</form>
	</body>
	</html>