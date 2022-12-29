<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<html>
<head>

<title>customer Registration</title>


</head>

<body>

<form:form action="processForm" modelAttribute="customer">
First Name:<form:input path="firstName"/>
<br>
<br>

Last Name (*):<form:input path="lastName"/>

<form:errors path="lastName" cssClass="error" cssStyle="color:red"/>
<br>
<input type ="submit" value="Submit"/>
</form:form>

</body>
</html>