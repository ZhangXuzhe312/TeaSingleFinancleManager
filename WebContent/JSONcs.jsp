<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$(function (){
	$("input").blur(function () {
		$.ajax({
		  	url : "AjaxCeshi",
			type : "POST",  
			data :{"name":$("input").val()},  
			dataType : "json",
			success : function(result) {
				alert(result);
			}
		})
	})
	
	
	
	$("input").click(function (){
		$.ajax({
			url : "AjaxCeshi",
			type : "POST",  
			data :null,  
			dataType : "json",
			success : function(result) {
				alert();
			}
		})
	})
})




</script>
</head>
<body>
用户名:<input type="text" namn="uname" />
<input type="submit" value="提交" />
</body>
</html>