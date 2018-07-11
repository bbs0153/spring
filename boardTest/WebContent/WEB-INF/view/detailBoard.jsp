<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="60%">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>날짜</td>
			<td>내용</td>
			<td>조회수</td>
			<td>파일</td>
			<td>아이피</td>
		</tr>

		<tr>
			<td>${b.no}</td>
			<td>${b.title}</td>
			<td>${b.regdate}</td>
			<td>${b.content}</td>
			<td>${b.hit}</td>
			<td>${b.fname}</td>
			<td>${b.ip}</td>
		</tr>
	</table>
	
	<a href="updateBoard.do?no=${b.no}">수정</a>
	<a href="deleteBoard.do?no=${b.no}">삭제</a>
	
</body>
</html>