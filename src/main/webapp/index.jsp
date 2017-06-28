<%--
  Created by IntelliJ IDEA.
  User: gaogao
  Date: 2017/6/28
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的网站</title>
</head>
<body>
<hi>我的Session网站</hi>
<%
    String user=(String) session.getAttribute("user");
%>
<%
    if (user==null || "".equals(user)) {
%>
   欢迎游客！
    <a herf="/Java/login.jsp">登陆</a>
<a herf="#">注册</a>
<%
}
%>

</body>
</html>
