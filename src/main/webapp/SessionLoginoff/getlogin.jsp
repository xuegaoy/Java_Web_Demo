<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <h1>我的网站--登陆</h1>
    <form action="<%=request.getContextPath()%>/loginServlet" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="text" name="password">
        <input type="submit" value="登陆">

    </form>

</body>
</html>
