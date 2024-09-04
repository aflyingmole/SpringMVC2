<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>members/result.jsp</title>
</head>
<body>
<h1>요청작업 완료!!!!</h1>
<c:choose>
    <c:when test="${code=='success'}">
        요청작업 성공!!!!!!😊😊😊
    </c:when>
    <c:otherwise>
        요청작업 실패ㅠㅠ😂😂😂
    </c:otherwise>
</c:choose>
<a href="<%=request.getContextPath()%>/">홈으로</a>"
<a href="../../">홈으로</a>"
</body>
</html>
