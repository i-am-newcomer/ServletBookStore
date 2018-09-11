<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册-BOOK STORE</title>
</head>
<body>
<table width="90%" height="600px" rules="none" border="0" align="center">
	<tr height="15%"><td>
		<jsp:include page="header2.jsp" flush="true">
			<jsp:param value="登录" name="subTitle"/>
		</jsp:include>
	</td></tr>
	
	<tr><td align="center" valign="top"><h1>欢迎您， ${sessionScope.user.name}</h1></td></tr>
	
	<tr height="5%"><td>
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>