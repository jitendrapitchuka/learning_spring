<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<title>
Student confirmation form

</title>

</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName }
<br>
country: ${student.country }
<br>
Favorite lan: ${student.favoriteLanguage }

<br>

Operating system:
<ul>
<c:forEach var="temp" items="${student.operatingSystem }">
<li> ${temp} </li>

</c:forEach>

</ul>

</body>


</html>