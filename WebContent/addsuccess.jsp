<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加成功</title>
</head>
<body>
<table width="90%" height="600px" rules="none" border="0" align="center">
	<tr height="15%"><td colspan="2">
		<jsp:include page="header2.jsp" flush="true">
			<jsp:param value="登录" name="subTitle"/>
		</jsp:include>
	</td></tr>
	
	<tr align="center">
		<td colspan="2"><h1>商品已成功添加至购物车</h1></td>
	</tr>
	<tr align="center">
		<td><a href="showcart.do" style="color:red;text-decoration:none;font-size:24px;">去购物车结算</a></td>
		<td><a href="default.jsp" style="color:red;text-decoration:none;font-size:24px;">继续购物</a></td>
	</tr>
	
	<tr height="15%"><td colspan="2">
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>