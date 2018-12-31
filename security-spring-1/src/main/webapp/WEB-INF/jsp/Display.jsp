<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import = "java.text.SimpleDateFormat"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.active {
	background-color: #4CAF50;
	color: white;
}

.topnav .icon {
	display: none;
}

@media screen and (max-width: 600px) {
	.topnav a:not (:first-child ) {
		display: none;
	}
	.topnav a.icon {
		float: right;
		display: block;
	}
}

@media screen and (max-width: 600px) {
	.topnav.responsive {
		position: relative;
	}
	.topnav.responsive .icon {
		position: absolute;
		right: 0;
		top: 0;
	}
	.topnav.responsive a {
		float: none;
		display: block;
		text-align: left;
	}
}

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

</style>
 <%
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
  String date = sdf.format(new Date());
%>


</head>
<body>

	<div class="topnav" id="myTopnav">
		<a href="/add" class="active">HOME</a> <a href="/adder "
			>CUSTOMERSDETAILS</a> <a href="/delete">DELETE</a>
			<a href="/update">UPDATE</a><a href="/search">SEARCH</a>
	 <i class="fa fa-bars"></i>
		</a>
	</div>


	<div id="wrapper">
		<div id="header">
			<h2>WELCOME</h2>
		</div>
	</div>
	

	<form:form action="adder" modelAttribute="show" method="POST">
customerID: <form:input path="customerCode" />
 <td><form:errors path="customerCode" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>

customerName: <form:input path="customerName" />
 <td><form:errors path="customerName" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerAddress:<form:input path="customerAddress" />
 <td><form:errors path="customerAddress" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerPincode: <form:input path="customerPincode" />
 <td><form:errors path="customerPincode" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerEmail:<form:input path="customerEmail" />
 <td><form:errors path="customerEmail" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
customerNumber:<form:input path="customerNumber" />
 <td><form:errors path="customerNumber" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
registrationDate:<form:input type="hidden" path="registrationDate" value="<%=date%>" />
        <br>
		<br>
createdBy:<form:input path="createdBy"/>
 <td><form:errors path="createdBy" cssStyle="color: #ff0000;"/></td>

		<br>
		<br>
modifiedDate:<form:input path="modifiedDate" />
 <td><form:errors path="modifiedDate" cssStyle="color: #ff0000;"/></td>

		 <br>
		<br>
		
		<input type="submit" value="submit" />
		<br><br>
	</form:form>

<a href="/first"> Back</a><br>
</body>
</html>



