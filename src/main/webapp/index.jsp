<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<meta charser="UTF-8">
	<title>Servlet</title>
</head>
<body>
	<h2>환영합니다.</h2>
	<a href="MyServlet">MyServlet</a>
	
	<form action="MyServlet" method="POST">
		<input type="number" name="a" placeholder="첫번째 숫자를 입력하세요.">
		<input type="number" name="b" placeholder="두번째 숫자를 입력하세요.">
		<select name="key">
			<option value="add">+</option>
			<option value="subtract">-</option>
			<option value="multiply">*</option>
			<option value="divide">/</option>
		</select>
		<input type="submit" value="계산">
	</form>
</body>
</html>
