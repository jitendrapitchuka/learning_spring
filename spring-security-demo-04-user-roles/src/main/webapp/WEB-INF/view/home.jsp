<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	Welcome to the luv2code company home page!
	
	<p>User :<security:authentication property="principal.username"/> </p><br>
	<p>Roles:<security:authentication property="principal.authorities"/> </p>
	<br>
	
	<hr>
	<security:authorize access="hasRole('MANAGER')" >
	<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting(for managers)</a></security:authorize>
	<hr>
	<security:authorize access="hasRole('ADMIN')" >
	<a href="${pageContext.request.contextPath}/systems">Systems(for admins)</a></security:authorize>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout" />
</form:form>
</body>

</html>