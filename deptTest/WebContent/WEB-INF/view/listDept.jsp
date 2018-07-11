<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서목록</h2>
	<hr>
	<table border="1" width="60%">
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
		</tr>

		<c:forEach items="${list}" var="i">
			<tr>
				<td>${i.dno}</td>
				<td>${i.dname}</td>
				<td>${i.dloc}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>