<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>뷰뷰뷰</h1>
<hr>

test key : <%=session.getAttribute("test") %>
<hr>
Session ID :  <%=session.getId()%><br>
CreationTime : <%= new Date(session.getCreationTime())%><br>
LastAccesedTime : <%= new Date(session.getLastAccessedTime())%><br>
MaxInactiveInterval : <%= session.getMaxInactiveInterval()%><br>
isNew : <%= session.isNew()%><br>


<hr>
<h3><a href="/session/create">세션 생성</a></h3> <h3><a href="/session/delete">세션 삭제</a></h3>

</body>
</html>