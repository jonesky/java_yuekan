<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1 align="center">登陆中心</h1>
	
	<form action="login.do">
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userid"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>记住密码：<input type="checkbox" value="1"/></td>
				<td><input type="submit" name="submit" value="登陆 "/></td>
			</tr>
		</table>
	</form>
</body>
</html>