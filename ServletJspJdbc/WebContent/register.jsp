<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration  page</title>
</head>
<body>
<form action="register" method="get">
name:<input type="text" name="name"/><br/>
password:<input type="password" name="password"/><br/>
EmailId:<input type="text" name="email"/><br/>
Language:<select name="language">
         <option>Marathi</option>
         <option>hindi</option>
           <option>Telugu</option>
         <option>kannada</option>
         <option>english</option>
</select><br/>
<input type="submit" value="submit"/>
</form>
<a href="login.jsp">login</a>
</body>
</html>