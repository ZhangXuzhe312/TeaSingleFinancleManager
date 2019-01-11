<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        #idimg{
            width: 1907px;
            height:300px;
            position: absolute;
            top:-198px;
            bottom: auto;
            left: 84px;
            right:20px;
        }
       li{
           text-align: center;
           line-height: 115px;

       }
        a{
            text-decoration: none;
            color: black;
            font-family: "黑体";
            font-size: large;
        }
    </style>
</head>
<body>

<div style="width: 100%;height: 300px;background-color: red">
</div>
<div style="width:100%;height: 800px;">
        <div  style="width: 400px;height: 800px;float: left;border: none;background-color: chartreuse">
            <ul>
                <li><a href="AdminManage?methods=manageUser" target="ifre"><h5>用户管理</h5></a></li>
                <li> <a href="AdminManage?methods=manageTea" target="ifre"><h5>教师个人财务管理</h5></a></li>
                <li> <a href="AdminManage?methods=manageApp" target="ifre"><h5>申报记录管理</h5></a></li>
            </ul>
    </div>
    <div class="content-left" style="width: 1500px;height: 800px;float: left">
        <iframe style="width: 1500px;height: 800px;margin: 0px 7px" name="ifre" scrolling="auto" frameborder="0"></iframe>
    </div>
</div>


</body>
</html>