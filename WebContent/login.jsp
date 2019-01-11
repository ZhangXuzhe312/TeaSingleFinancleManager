<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>教师个人财务报账管理系统</h3>
<form action="LoginRequest" method="post">
账户:<input type="text" name="uname"/> <br />
密码:<input type="password" name="upwd" /> <br />
<input type="radio" name="loginertype" checked="checked"/>教师
<input type="radio" name="loginertype"/>管理员<br />
<input type="submit" value="登陆"/>
</form>
</body>
</html>