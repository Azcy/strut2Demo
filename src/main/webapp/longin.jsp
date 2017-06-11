<%--
  Created by IntelliJ IDEA.
  User: zcy
  Date: 2017/6/4
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        function login() {
            targetForm=document.forms[0];
            alert("登陆");
            targetForm.method="post";
            targetForm.action="loginAction";
            targetForm.submit();

        }
        function regist() {

            targetForm=document.forms[0];
            alert("注册");
            targetForm.method="post";
            targetForm.action="registAction";//也可以通过"actionName!methodName,actionm"
            targetForm.submit();

        }
    </script>
</head>

<body>
        <form >
            用户名：<input type="text" name="username"/><br>
            密 码：<input type="text" name="password"/><br>

            <input type="submit" onclick="login();" value="登陆"/>
            <input type="submit" onclick="regist();" value="注册"/>
            <%--<button type="button" onclick="regist()">注册</button>--%>
            <%--<button type="button" onclick="login()">登陆</button>--%>

        </form>

</body>
</html>
