<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Palabra</title>
	</head>
	<body>
		<h3>Comprobar Palabra</h3>
		<form:form action="addPalabraForm" method="post" modelAttribute="palabra">
            <span>Palabra:</span>
            <form:input path="palabra" type="text" name="palabra"/>
            <br/>
			<input type="submit"/>
		</form:form>
	</body>
</html>