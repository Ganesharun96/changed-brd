<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>
<script type="text/javascript">
  $(function () {
    $("#createAccount").click(function () {
      window.location.href = "/register";
    });
  });
</script>
</head>
<body>
<h1></h1>
<div> <button type="button" class="btn"  id="createAccount">Create Account</button></div>

<ul style="list-style-type:square">
  <li><a href="/add">HOME</a></li><br>
  <li><a href="/adder">CUSTOMERSDETAILS</a></li><br>
  <li><a href="/delete">DELETE</a></li><br>
  <li><a href="/update">UPDATE</a></li><br>
  <li><a href="/search">SEARCH</a></li><br>
</ul> 

<form action="/logout" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 <button type="submit" class="btn">Log out</button>
 </form>
<!-- <a href="/logout">logout</a> -->

</body>
</html>