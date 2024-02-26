<%@ taglib prefix="c" uti="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="30%">
   <tr>
     <th>code</th>
     <th>items</th>
     <th>price</th>
   </tr>
  <c:forEach var="items" items="${foodItem}"> 
    <tr>
    <td> ${items.id}</td><br/>
    <td>${items.foodName}</td>
    <td>${items.food_price}</td>
    </tr>
  </c:forEach>
  
</table>
</body>
</html>