<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>未登录</title>
</head>
<body>
<table width="90%" height="600px" rules="none" border="0" align="center">
	<tr height="10%"><td>
		<jsp:include page="header1.jsp" flush="true" />
	</td></tr>
	
	<tr><td><h1 align="center">您尚未登录，<a href="login.jsp" style="color:red">请登录</a></h1></td></tr>
	
	<tr height="15%"><td>
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>