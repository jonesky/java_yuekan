<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>list</title>
	<style type="text/css">
		table.hovertable {
			font-family: verdana,arial,sans-serif;
			font-size:11px;
			color:#333333;
			border-width: 1px;
			border-color: #999999;
			border-collapse: collapse;
		}
		table.hovertable th {
			background-color:#c3dde0;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
		table.hovertable tr {
			background-color:#d4e3e5;
		}
		table.hovertable td {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
	</style>
</head>
<body>


	<div><p align="right">用户：${member.userName}  </p></div><div align="right"><a href="index.do" >返回</a></div>
	<br>
	<h3 align="center">历史查询信息</h3>
	<table border="1" align="center" class="hovertable">
		<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
			<th>商品号</th>
			<th align="center">商品信息</th>
			<th>操作</th>
		</tr>
		
		<c:forEach items="${goods}" var="b">
			<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td>${b.goodsUId}</td>
				<td>
					<div style="word-break:break-all"><p>商品名:&nbsp;&nbsp;&nbsp;${b.googsName}</p></div>
					<div style="word-break:break-all"><p>URL:&nbsp;&nbsp;&nbsp;<a href="${b.goodsURL}">${b.goodsURL}</a></p></div>
					<div style="word-break:break-all"><p>商品评价值:&nbsp;&nbsp;&nbsp;${b.goodsAttribute}</p></div>
				</td>
				<td>
					<div style="white-space:nowrap"><a href="details.do?goods_uid=${b.goodsUId}">详情</a></div>
					<br>
					<div style="white-space:nowrap"><a href="delete.do?goods_id=${b.goodsId}">删除</a></div>
				</td>
			</tr>
		</c:forEach>	
	</table>
	
</body>
</html>