<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>


<c:forEach var="book" items="${books}">
 <h1> <c:out value="${book.title }" ></c:out></h1>
 <p>Description <c:out value="${book.description }" ></c:out></p>
 
 
<!-- <p>Language <c:out value="${book.language }" ></c:out></p> --> 

 <!--  <p>Number of pages <c:out value="${book.numberOfPages }" ></c:out></p>-->
        </c:forEach>

</body>
</html>