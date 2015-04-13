<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DashBoard</title>
</head>
<body>
	${message }
	<form action="login" method="post">
		<input type="text" id="userName" name="userName" /> 
		<input type="password" id="pwd" name="pwd" /> 
		<input type="submit" value="Login" />
	</form>

</body>
</html>