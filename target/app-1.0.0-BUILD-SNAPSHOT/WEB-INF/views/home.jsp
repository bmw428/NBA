<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	
	<head>
		<title>Login</title>
	</head>
	
	<body>
		
		<h1>
			Login Form  
		</h1>
		
		<%-- <P>  Message: ${message}. </P> --%>
		
		<form name="loginform" action="<c:url value='j_spring_security_check' />" method="POST">
			Username: <input type="text" name="j_username"><br>
			Password: <input type="password" name="j_password"><br>
			<input type="submit" name="submit">
		</form>
	
	</body>
	
</html>
