<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
</head>
<body>
<h3>1. <a href="/JDBC/Emp.do?action=list">목록조회</a></h3>
<h3>2. <a href="/JDBC/hr/EmpSearch.jsp">사원/부서검색</a></h3>
<h3>3. <a href="/JDBC/Emp.do?action=insert">사원입력</a></h3>
<h3>4. 
<c:choose>
	<c:when test="${empty userId }">
	<a href="/JDBC/Login.jsp">로그인</a><br>
5. <a href="/JDBC/MemberInsert.jsp">회원가입</a>
	</c:when>
	<c:otherwise>
	${userId }님 안녕하세요.
	<a href="/JDBC/Login.do">로그아웃</a>
	</c:otherwise>
</c:choose>
</h3>
</body>
</html>