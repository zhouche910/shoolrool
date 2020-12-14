<%--
  Created by IntelliJ IDEA.
  User: X1
  Date: 2020/12/12
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">

    <link rel="stylesheet" type="text/css" href="css/left-side-menu.css">
      <link rel="stylesheet" type="text/css" href="css/index.css">
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.slimscroll.min.js"></script>
    <script type="text/javascript"src="js/left-side-menu.js"></script>
    <SCRIPT type="text/javascript" src="js/index.js"></SCRIPT>
  </head>

  <body>
<div class="container">
<div class="header">
</div>
  <div class="GridLine">
  <div class="ti"><text class="shu">欢迎</text>
    <text class="font-red">管理员 adimin </text> <text>光临本系统</text>
  </div>

      <div class="Options">数据字典维护</div>
      <div class="Options1">修改密码</div>
      <div class="Options2">数据字典维护</div>
  </div>
<div class="content-1">
  <div class="menu-1">
    <div class="log">
    </div>
      <div class="nav">
          <h2>用户管理</h2>
          <ul>
              <li><a href="#">学生管理</a></li>
              <li><a href="#">教师管理</a></li>
          </ul>
          <h2>课程管理</h2>
          <ul>
              <li><a href="#">课程信息维护</a></li>
          </ul>
          <h2>成绩管理</h2>
          <ul>
              <li><a href="#">成绩信息维护</a></li>
          </ul>
          <h2>系统管理</h2>
          <ul>
              <li><a href="#">数据字典维护</a></li>
          </ul>
      </div>

  </div>


  <div class="Show_off">
    <form id="courseFrom">

        <div class="headerList">
            <div class="headerTitle">
                <div class="marker" ></div>
                <text class="headerName">课程表-列表</text>
            </div>
            <div class="buttonList">
                <button class="button1">所有</button>
                <button class="button1">查询</button>
                <button class="button1">添加</button>
                <button class="button1">删除</button>
            </div>
        </div>
        <table class="table_one font-center">
            <tr >
                <th class="bj" ></th>
                <th class="bj">课程编号</th>
                <th class="bj">课程名称</th>
                <th class="bj">课程学分</th>
                <th class="bj">课程学时</th>
                <th class="bj">教师名称</th>
                <th class="bj">使用标识</th>
            </tr>
            <tr>
                <td><input type="checkbox" name="checkbox1" value="0"/></td>
                <td>xxds2020</td>
                <td>线性代数</td>
                <td>30</td>
                <td>30</td>
                <td>王老师</td>
                <td>使用标识</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="checkbox1" value="0"/></td>
                <td>lssx2142</td>
                <td>离散数学</td>
                <td>5</td>
                <td>15</td>
                <td>李老师</td>
                <td>使用标识</td>
            </tr>
        </table>
    </form>

  </div>
</div>
</div>
  </body>
</html>
