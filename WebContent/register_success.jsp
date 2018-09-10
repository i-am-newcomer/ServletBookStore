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
			<jsp:param value="注册" name="subTitle"/>
		</jsp:include>
	</td></tr>
	
	<tr ><td align="center"><h1>注册成功</h1></td></tr>
	<tr><td align="center" valign="top"><a href="login.jsp" style="text-decoration:none;color:red;font-size:25px;">请登录</a></td></tr>
	
	<tr height="5%"><td>
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>