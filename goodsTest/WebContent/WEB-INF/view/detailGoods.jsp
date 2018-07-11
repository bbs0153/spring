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
			<td>상품번호</td>
			<td>상품명</td>
			<td>가격</td>
			<td>수량</td>
			<td>이미지</td>
		</tr>
		
		
		<tr>
			<td>${g.no}</td>
			<td>${g.item}</td>
			<td>${g.price}</td>
			<td>${g.qty}</td>
			<td><img src="img/${g.fname}" width="100" height="100"></td>
		</tr>
	</table>
	<a href="updateGoods.do?no=${g.no}">상품수정</a>
	<a href="deleteGoods.do?no=${g.no}">상품삭제</a>
</body>
</html>