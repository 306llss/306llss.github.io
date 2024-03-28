<%--
  Created by IntelliJ IDEA.
  User: 朱子汶
  Date: 2024/3/25
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录错误</title>
</head>
<body>
<h3>用户登录错误界面</h3>
<%=request.getAttribute("errorMessage")%>
</body>
</html>