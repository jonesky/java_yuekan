<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>upbook</title>
</head>
<body>
	<form action="upbook.do">
		<table>
			<tr>
				<td>书号</td>
				<td><input type="text" name="alter_id"  value="${book.id}"   readonly="readonly"></td>
			</tr>
			<tr>
				<td>书名</td>
				<td><input type="text" name="alter_name" value="${book.name}"></td>
			</tr>
			<tr>
				<td>出版社</td>
				<td><input type="text" name="alter_press" value="${book.press}"></td>
			</tr>
			<tr>
				<td>作者</td>
				<td><input type="text" name="alter_author" value="${book.author}"></td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input type="text" name="alter_price" value="${book.price}"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="修改"></td>
			</tr>
		</table>
	</form>
</body>
</html>