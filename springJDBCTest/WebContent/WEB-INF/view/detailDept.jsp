<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서상세목록</h2>
	<hr>
	<table border="1" width="60%">
		<tr>
			<td>부서번호</td>
			<td>부서명</td>
			<td>부서위치</td>
		</tr>

			<tr>
				<td>${d.dno}</td>
				<td>${d.dname }</td>
				<td>${d.dloc }</td>
			</tr>
	</table>
	<a href="updateDept.do?dno=${d.dno}">수정</a>
	<a href="deleteDept.do?dno=${d.dno}">삭제</a>
</body>
</html>