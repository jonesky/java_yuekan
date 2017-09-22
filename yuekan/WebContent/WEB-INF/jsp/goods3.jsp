<%@page import="entry.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>add</title>
</head>
<body>
	<div><p align="right">用户：${member.userName}  </p></div><div align="right"><a href="list.do" >返回</a></div>
	<br>
	<div><h3 style="color: blue;">商品号:</h3>&nbsp;&nbsp;&nbsp;${goo.goodsUId}</div>
	<div><h3 style="color: blue;">商品名:</h3>&nbsp;&nbsp;&nbsp;${goo.googsName}</div>
	<div><h3 style="color: blue;">URL:</h3>&nbsp;&nbsp;&nbsp;${goo.goodsURL}</div>
	<div><h3 style="color: blue;">评价值:</h3>&nbsp;&nbsp;&nbsp;${goo.goodsAttribute}</div>
	<br>
	<%
		Goods g1 = (Goods)request.getAttribute("goo");
		if(g1.getGoodsAttribute() >= 0.8){
			%>
			<h1 style="color: red;" align="center">用户评价好 系统推荐购买</h1>
	<%
		}
	%>
</body>
</html>