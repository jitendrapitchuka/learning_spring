<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>

<html>
<head>

<title>Student Registration</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName"/>
<br>
<br>

Last Name:<form:input path="lastName"/>
<br>
<br>

Select country:
<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
<br>
<br>
<br>

Favorutite language:

JAVA<form:radiobutton path="favoriteLanguage" value="java" />
C#<form:radiobutton path="favoriteLanguage" value="C#" />
PYTHON<form:radiobutton path="favoriteLanguage" value="python" />
 

Operating Systems:

Linux<form:checkbox path="operatingSystem" value="Linux"/>
Mac<form:checkbox path="operatingSystem" value="max"/>
Windows<form:checkbox path="operatingSystem" value="windows"/>

<input type ="submit" value="Submit"/>
</form:form>

</body>
</html>