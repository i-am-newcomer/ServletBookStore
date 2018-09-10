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
	
	<tr><td>
		<form action="login.do" method="post">
			<table width="80%" rules="none" border="0" align="center">
				<tr><td colspan="3" align="center"><h1>用户登录</h1></td></tr>
				<tr><td colspan="3" align="center"><h3>${requestScope.login_result}</h3></td></tr>
				<tr>
					<td align="right" width="30%"><span>账号</span></td>
					<td align="left" width="70%" colspan="2"><input type="text" name="login_name" placeholder="邮箱/手机号/用户名" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="30%"><span>密码</span></td>
					<td align="left" width="70%" colspan="2"><input type="password" name="login_pwd" placeholder="密码" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="40%"><img alt="checkcode" src="checkcode"></td>
					<td align="left" width="20%"><input type="text" name="login_checkcode" style="width:200px;height:25px;margin:5px;"></td>
					<td align="left" width="40%"><a href="" onclick="myReload()" style="color:red">看不清，换一张</a></td>
				</tr>
				<tr><td colspan="3" align="center"><input type="submit" value="登录" style="width:150px;height:32px;margin:5px;background-color:#4688F1;color:#ffffff"/></td></tr>
			</table>
		</form>	
	</td></tr>
	
	<tr height="15%"><td>
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>