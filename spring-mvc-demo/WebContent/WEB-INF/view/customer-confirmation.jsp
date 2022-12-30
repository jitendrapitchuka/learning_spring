<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>

<title>customer Success</title>
</head>

<body>

<h2>The customer name: ${customer.firstName }   ${customer.lastName }<h2/>
 <h2>No OF passes:${customer.freePasses }</h2>
 <h2> pincode : ${customer.pincode }</h2>
  <h2> coursecode : ${customer.courseCode }</h2>
</body>
</html>