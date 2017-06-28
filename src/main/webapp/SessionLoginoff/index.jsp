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
<h1>我的Session网站</h1>
<%
    String user = (String) session.getAttribute("user");
%>
<%
    if (user == null || "".equals(user)) {
%>
欢迎游客！
<a href="/SessionLoginoff/getlogin.jsp">登陆</a>
<a href="#">注册</a>
<%
    }else{
%>
欢迎回来！<%=user %>
<a href="${pageContext.request.contextPath}/servlet/LogoutServlet">注销</a>
<%
    }

%>

</body>
</html>
