<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

		<c:forEach items="${list}" var="g">
			<tr>
				<td>${g.no}</td>
				<td><a href="detailGoods.do?no=${g.no}">${g.item}</a></td>
				<td>${g.price}</td>
				<td>${g.qty}</td>
				<td><img src="img/${g.fname}" width="100" height="100"></td>
			</tr>
		</c:forEach>
	</table>
	<a href="insertGoods.do">상품등록</a>

</body>
</html>