<%--
  Created by IntelliJ IDEA.
  User: gaogao
  Date: 2017/6/23
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>error</title>
</head>
<body>
登陆失败。<br/>
提交信息如下：<br/>
用户名：<%=request.getParameter("uname") %><br/>
密码：<%=request.getParameter("upwd") %><br/>
<a href="15/Login.jsp">返回登陆界面</a>
</body>
</html>
