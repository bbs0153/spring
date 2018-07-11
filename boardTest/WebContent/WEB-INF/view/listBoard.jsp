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
	<table border="1" width="60%">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>

		<c:forEach items="${list}" var="b">
			<tr>
				<td>${b.no}</td>
				<td><a href="detailBoard.do?no=${b.no}">${b.title}</a></td>
				<td>${b.writer}</td>
				<td>${b.regdate}</td>
				<td>${b.hit}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="insertBoard.do">게시물 등록</a>
</body>
</html>