<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>纯css3样式控制table表格隔行高亮显示</title>
<style>
body{font-family:Arial; font-size:14px;line-height:180%;padding-top: 20px;} /*总控制，可忽略此行*/
table tr:first-child{background:#0066CC; color:#fff;font-weight:bold;} /*第一行标题蓝色背景*/
table{border-top:1pt solid #C1DAD7;border-left:1pt solid #C1DAD7;margin: 0 auto;} 
td{ padding:5px 10px; text-align:center;border-right:1pt solid #C1DAD7;border-bottom:1pt solid #C1DAD7;}
tr:nth-of-type(odd){ background:#c6f9f7} /* odd 标识奇数行，even标识偶数行 */
tr:hover{ background: #E0F0F0;} /*鼠标悬停后表格背景颜色*/
</style>
</head>
<body>
	<table width='600' border='0' cellspacing='0' cellpadding='0' align='center'>
	  	<tr>
		    <td>序号</td>
		    <td>用户</td>
		    <td>评论</td>
		    <td>评价分</td>
	  	</tr>
	  	<c:forEach items="${evaluates}" var="b">
	  		<tr >
					<td>${b.goodsId}</td>
					
			</tr>
		</c:forEach>
	</table>
</body>
</html>