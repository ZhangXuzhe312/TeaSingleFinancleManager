<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>用户管理</h3>
<table style="width: 500px;height: 50px" border="1" cellspacing="1" >
    <th>
     	<td>教师编号</td>
        <td>教室名</td>
        <td>权限</td>
        <td>状态</td>
        <td>修改</td>
        <td>删除</td>
        <td>禁用</td>
    </th>
    
	<c:forEach var="#" items="#">
	<tr>
	<td>#</td>
	<td>#</td>
	<td></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>