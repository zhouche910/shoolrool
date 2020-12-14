<%--
  Created by IntelliJ IDEA.
  User: X1
  Date: 2020/12/12
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登陆界面</title>
</head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/login.css">
<body>
<div class="row justify-content-center" >
    <div class="main col-7 m-auto top-ben">

        <div class="user-s">
            <text>用户名</text><br>
            <input type="text" autocomplete="off"
                   placeholder="用户名" name="userNameOrEmailAddress" required/>
        </div>
        <div class="user-p">
            <text>密码</text><br>
            <input type="text" autocomplete="off"
                   placeholder="用户名" name="userNameOrEmailAddress" required/>
        </div>
        <div>
            <div style="text-align: center">
                <button type="submit" class="enter-btn" >登录</button>
                <button type="submit" class="enter-btn" >重填</button>
            </div>

        </div>
    </div>
</div>

<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>
