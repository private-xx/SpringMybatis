<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="/user/testModelAttribute">
    <input type="hidden" value="1" name="uId"/>
    用户名：<input name="userName" value="lihui"/>
    年龄：<input name="age" value="13"/>
    <input type="submit" value="submit"/>
</form>
<br/>
<form action="/user/testMethodPost" method="post" accept-charset="utf-8">
    班级号：<input name="uId" type="text"/>
    <br/>
    班级名称：<input name="userName" type="text"/>
    <br/>
    教师号：<input name="age" type="text"/>
    <br/>
    <input type="submit" value="提交"/>
</form>
<br/>
<a href="/user/testMethod">testMethod</a>
<br/>
<a href="/user/testMethodParams?username=lihui&age=1">testMethodParams</a>
<br/>
<a href="/user/testPathVariable/4">testPathVariable</a>
<br/>
<a href="/user/testParam?uId=2&userName=lihui&age=1">testParam</a>
<br/>
<a href="/user/testMap">testMap</a>
<br/>
<a href="/user/testSession">testSession</a>
</body>
</html>
