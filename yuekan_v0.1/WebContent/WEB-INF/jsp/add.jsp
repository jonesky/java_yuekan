<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>add</title>
</head>
<body>
	<div><p align="right">用户：${member.userName}  </p></div><div align="right"><a href="exit.do" >退出</a></div>
	<br>
	<form action="query.do" align="center">
		<div>
			商品URL
			<input type="text" name="goodsURL">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
		<div>
			评论URL
			<input type="text" name="evaluateURL">
			<input type="submit" value="查询" method = 'post'>
		</div>
	</form>
	<br>
</body>
</html>