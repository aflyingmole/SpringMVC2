<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list.jsp</title>
</head>
<body>
<table border="1">
    <tr>
        <th>회원번호</th>
        <th>이름</th>
        <th>전화번호</th>
        <th>주소</th>
        <th>가입일</th>
    </tr>
    <c:forEach var="mem" items="${list}">
        <tr>
            <td>${mem.num}</td>
            <td>${mem.name}</td>
            <td>${mem.phone}</td>
            <td>${mem.addr}</td>
            <td>${mem.regdate}</td>
            <td><a href="/members/update?num=${mem.num}">수정</a></td>
            <td><a href="/members/delete?num=${mem.num}">삭제</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
