<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save">
<pre>
Username     :   <input type="text" name="username">
Password     :   <input type="text" name="password">
Email Id     :   <input type="text" name="email">
<select name="usertype">
<option>Select</option>
<option value="admin">Admin</option>
<option value="user">User</option>
</select>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>