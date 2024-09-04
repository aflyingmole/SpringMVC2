<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>views/members/insert.jsp</title>
</head>
<body>
<h1>회원수정</h1>
<form method="post" action="${pageContext.request.contextPath}/members/update">
    번호<br>
    <input type="text" name="num" value="${vo.num}"readonly ><br>
    이름<br>
    <input type="text" name="name" value="${vo.name}"><br>
    전화번호<br>
    <input type="text" name="phone" value="${vo.phone}"><br>
    주소<br>
    <input type="text" name="addr" value="${vo.addr}"><br>
    <input type="submit" value="수정">
</form>
</body>
</html>
