<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import = "java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>successfully register</h2>
<form:form  action="" method="post" modelAttribute="register">

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

name<form:input type="text" path="name" /><br>
Username<form:input type="text" path="username" /><br>
password<form:input type="password"  path="password" /><br>

 <form:button>create account</form:button>
 </form:form >
</body>
</html>