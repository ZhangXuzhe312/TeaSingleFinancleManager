<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="UploadServlet" enctype="multipart/form-data">
申报说明: <input type="text"  name="appDetail"/> <br />
申报金额: <input type="text" name="appMoney"/> <br />
申报证明: <input type="file" name="appProve"/> <br />
<input type="submit" value="提交申报请求"/>
</form>
</body>
</html>