<%--
  Created by IntelliJ IDEA.
  User: gaogao
  Date: 2017/6/21
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆页面</title>
    <style type="text/css">
        body{
            color: #000;
            font-size: 14px;
            margin: 20px auto;
        }
    </style>
</head>
<body>
<form action="<%=request.getContextPath()%>/checkServlet" method="post" name="loginForm">
    <table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
        <tr>
            <td colspan="2" align="center" bgcolor="#E8E8E8">用户登陆</td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="uname"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="upwd"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="submit" onclick="return check(this);"/>
                <input type="reset" value="Reset"/>
            </td>
        </tr>
    </table>

</form>

</body>
</html>
