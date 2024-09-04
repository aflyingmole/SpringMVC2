<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>home!!!!!</h1>
<img src="<%=request.getContextPath()%>/resources/images/15.gif"/>
<ul>
    <li><a href="fortune?day=1">오늘의 운세</a> </li>
    <li><a href="fortune?day=2">내일의 운세</a> </li>
    <li><a href="members/insert">회원가입</a> </li>
    <li><a href="members/list">회원목록</a> </li>
</ul>

<%--
<form method="post" action="add">
    수1 <input type="text" name="num1"><br>
    수2 <input type="text" name="num2"><br>
    <input type="submit" value="두수합구하기">
</form>
--%>
<span>${sum}</span>
</body>
</html>
