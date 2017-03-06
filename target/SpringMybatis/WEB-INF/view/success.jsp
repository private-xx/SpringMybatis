<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/6
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h2>${aa.uId}</h2>
<h2>${aa.userName}</h2>
<h2>${aa.age}</h2>
${requestScope.aa}
</body>
</html>
